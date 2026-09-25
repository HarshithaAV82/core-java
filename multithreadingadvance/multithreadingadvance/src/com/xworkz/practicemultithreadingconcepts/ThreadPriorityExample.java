package com.xworkz.practicemultithreadingconcepts;

public class ThreadPriorityExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("Thread1 - priority:" + Thread.currentThread().getPriority());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        "Thread 2 - Priority: "
                                + Thread.currentThread().getPriority()
                );
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
