package com.xworkz.practicemultithreadingconcepts;

public class ThreadGroupExample {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("MYThreadGroup");

        Thread thread1 = new Thread(group, () -> {
            System.out.println("Thread 1 is running");
        }, "Thread-1");

        Thread thread2 = new Thread(group, () -> {

            System.out.println("Thread 2 is running");
        }, "THRead-2");

        Thread thread3 = new Thread(group, () -> {
            System.out.println("Thread 3 is running");
        }, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Group name:" + group.getName());
        System.out.println("Active threads:" + group.activeCount());
    }
}
