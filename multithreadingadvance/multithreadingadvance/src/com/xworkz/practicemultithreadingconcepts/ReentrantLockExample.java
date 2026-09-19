package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final ReentrantLock lock = new ReentrantLock();

    public void printMessage(String name) {

        lock.lock();

        try {
            for (int i = 1; i <= 5; i++) {

                System.out.println(name + ":" + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantLockExample
                reentrantLockExample = new ReentrantLockExample();

        Thread t1 = new Thread(() -> {
            reentrantLockExample.printMessage("Thread-1");
        });

        Thread t2 = new Thread(() -> {
            reentrantLockExample.printMessage("Thread2");
        });

        t1.start();
        t2.start();
    }
}

