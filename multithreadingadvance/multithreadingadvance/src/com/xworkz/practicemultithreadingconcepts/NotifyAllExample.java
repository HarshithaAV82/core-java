package com.xworkz.practicemultithreadingconcepts;

public class NotifyAllExample {

    private final Object lock = new Object();

    public void waitingThread(String name){

        synchronized (lock){
            try {
                System.out.println(name + " is working...");

                lock.wait();
                System.out.println(name + "resumed");
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public void notifyAllThreads(){

        synchronized (lock){

            System.out.println("Waking all waiting waiting threads...");
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {

        NotifyAllExample example = new NotifyAllExample();

        Thread thread1 = new Thread(() -> {
            example.waitingThread("Thread");
        });

        Thread thread2 = new Thread(() -> {
            example.waitingThread("Thread");
        });

        Thread thread3 = new Thread(() -> {
            example.waitingThread("Thread");
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        example.notifyAllThreads();
    }
}
