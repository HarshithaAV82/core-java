package com.xworkz.practicemultithreadingconcepts;

public class JoinExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            for (int i = 1; i <= 5; i++){

                System.out.println("Child Thread:" + i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread.start();

        try {
            thread.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Main thread completed.");
    }
}
