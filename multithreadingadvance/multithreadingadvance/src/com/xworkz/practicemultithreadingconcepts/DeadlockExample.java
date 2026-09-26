package com.xworkz.practicemultithreadingconcepts;

public class DeadlockExample {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void task1() {

        synchronized (lock1) {

            System.out.println("Thread 1 locked lock1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (lock2) {
                System.out.println("Thread 1 locked lock2");
            }
        }
    }

    public void task2() {

        synchronized (lock2) {

            System.out.println("Thread 2 locked lock2");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (lock1) {
                System.out.println("Thread 2 locked lock1");
            }
        }
    }

    public static void main(String[] args) {

        DeadlockExample example = new DeadlockExample();

        Thread thread1 = new Thread(() -> {
            example.task1();
        });

        Thread thread2 = new Thread(() -> {
            example.task2();
        });

        thread1.start();
        thread2.start();
    }
}