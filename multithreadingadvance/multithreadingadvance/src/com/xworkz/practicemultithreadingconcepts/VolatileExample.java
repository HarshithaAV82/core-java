package com.xworkz.practicemultithreadingconcepts;

public class VolatileExample {

    private volatile boolean running = true;

    public void startTask(){

        Thread thread = new Thread(() ->
        {
            while (running){
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Thread stopped...");
        });
        thread.start();
        try {
            Thread.sleep(800);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        running = false;
        System.out.println("Main thread changed running to false.");
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.startTask();
    }
}
