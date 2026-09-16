package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++){

            int taskNumber = i;

            executorService.submit(() -> {
                try {

                    System.out.println("Task" + taskNumber + "started by" + Thread.currentThread().getName());

                    Thread.sleep(2000);
                    System.out.println("Task" + taskNumber + "Completed");

                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                finally {
                    latch.countDown();
                }
            });
        }

        try {
            latch.await();
            System.out.println("All tasks completed . main thread continues.");
        }catch (InterruptedException e){

            Thread.currentThread().interrupt();
        }
        

    }
}
