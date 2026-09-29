package com.xworkz.practicemultithreadingconcepts;

public class RaceConditionExample {

    private int count = 0;

    public void increment(){
        count ++;
    }

    public static void main(String[] args) {

        RaceConditionExample raceConditionExample = new RaceConditionExample();

        Thread thread1 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++){
                raceConditionExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++){
                raceConditionExample.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count:" + raceConditionExample.count);
    }
}
