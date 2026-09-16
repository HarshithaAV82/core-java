package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++){

            int taskNumber = i;

            executorService.submit(() -> {
                try {

                    semaphore.acquire();

                    System.out.println("Task" + taskNumber + "entered the resource using" + Thread.currentThread().getName());

            Thread.sleep(20000);

                    System.out.println("Task" + taskNumber + "leaving the resource");

                    semaphore.release();
        }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
    });
        }

        executorService.shutdown();
    }
}