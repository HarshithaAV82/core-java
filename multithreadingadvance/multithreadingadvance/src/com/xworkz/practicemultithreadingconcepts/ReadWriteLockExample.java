package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private String message = "Hello";

    private  final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void readMessage(String name){
        lock.readLock().lock();
        try {
            System.out.println(name + " is reading: " + message);

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        } finally {
            lock.readLock().unlock();
        }
    }

    public void writeMessage(String message) {

        lock.writeLock().lock();

        try {
            this.message = message;

            System.out.println(
                    "Writing new message: " + message);

        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReadWriteLockExample example =
                new ReadWriteLockExample();

        // Reader 1
        Thread thread1 = new Thread(() -> {
            example.readMessage("Thread 1");
        });

        // Reader 2
        Thread thread2 = new Thread(() -> {
            example.readMessage("Thread 2");
        });

        // Writer
        Thread thread3 = new Thread(() -> {
            example.writeMessage("Welcome to Java");
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
