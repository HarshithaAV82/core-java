package com.xworkz.practicemultithreadingconcepts;

public class ClassLevelLockingExample {

    public static synchronized void printMessage(String name) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(name + ":" + i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
          printMessage("Thread1");

        });

        Thread thread2 = new Thread(() -> {
            printMessage("THread2");
        });

        thread1.start();
        thread2.start();
    }
}