package com.xworkz.practicemultithreadingconcepts;

public class WaitNotifyExample {

    private final Object lock = new Object();

    public void waitingThread() {

        synchronized (lock) {

            try {
                System.out.println("Thread is waiting...");

                lock.wait();

                System.out.println("Thread resumed.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void notifyingThread() {

        synchronized (lock) {

            System.out.println("Sending notification...");

            lock.notify();
        }
    }

    public static void main(String[] args) {

        WaitNotifyExample example = new WaitNotifyExample();
        Thread thread1 = new Thread(example::waitingThread);
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            example.notifyingThread();
        });

        thread1.start();
        thread2.start();

    }
}