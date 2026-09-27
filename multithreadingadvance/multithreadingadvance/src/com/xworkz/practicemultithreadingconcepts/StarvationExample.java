package com.xworkz.practicemultithreadingconcepts;

public class StarvationExample {

    private final Object lock = new Object();

    public void work(String name) {

        synchronized (lock) {

            System.out.println(name + " got the lock.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println(name + " completed work.");
        }
    }

    public static void main(String[] args) {

        StarvationExample example =
                new StarvationExample();

        Thread thread1 = new Thread(() -> {
            while (true) {
                example.work("Thread 1");
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                example.work("Thread 2");
            }
        });

        thread1.start();
        thread2.start();
    }
}