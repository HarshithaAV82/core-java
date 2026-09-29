package com.xworkz.practicemultithreadingconcepts;

public class ThreadLocalExample {

    private static ThreadLocal<String> user = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            user.set("HArshitha");

            System.out.println("Thread 1:" + user.get());
        });

        Thread thread2 = new Thread(() -> {
            user.set("AV");

            System.out.println("Thread2 :" + user.get());
        });

        thread1.start();
        thread2.start();
    }
}
