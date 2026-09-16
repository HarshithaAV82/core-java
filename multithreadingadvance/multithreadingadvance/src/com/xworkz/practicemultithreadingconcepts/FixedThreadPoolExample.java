package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i= 0; i <= 5; i++) {

            int taskNumber = i;

            executorService.submit(() -> {

                System.out.println("Task" + taskNumber + "is executed by" + Thread.currentThread().getName());

                try {

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

        }
        executorService.shutdown();
        System.out.println("All tasks submitted");

    }
}
