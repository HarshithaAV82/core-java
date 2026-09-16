package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableExample {

    public static void main(String[] args) {

        // Step 1: Create a Fixed Thread Pool with 3 threads
        ExecutorService executorService =
                Executors.newFixedThreadPool(3);

        try {

            // Step 2: Create and submit multiple Callable tasks
            for (int i = 1; i <= 5; i++) {

                int taskNumber = i;

                Future<Integer> future = executorService.submit(() -> {

                    System.out.println(
                            "Task " + taskNumber
                                    + " executed by "
                                    + Thread.currentThread().getName()
                    );

                    return taskNumber * 10;
                });

                // Step 3: Get the result
                System.out.println(
                        "Result: " + future.get()
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            // Step 4: Shut down ExecutorService
            executorService.shutdown();
        }
    }
}