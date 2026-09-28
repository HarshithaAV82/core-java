package com.xworkz.practicemultithreadingconcepts;

public class LivelockExample {

    static class Person{

        private boolean moving = true;

        public boolean isMoving(){
            return moving;
        }

        public void move(){
            moving = !moving;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        Thread thread1 = new Thread(()-> {
            for (int i = 1; i <= 5; i++){
                System.out.println("Person 1 is changing direct.");
                person1.move();

                try {
                    Thread.sleep(800);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread2 = new Thread(() -> {

            for (int i = 1; i <= 5; i++){

                System.out.println("Person 2 is changing direction.");
                person2.move();

                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
