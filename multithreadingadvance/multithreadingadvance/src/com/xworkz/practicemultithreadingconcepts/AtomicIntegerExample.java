package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger(0);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++){

            executorService.submit(() -> {

                int value = count.incrementAndGet();

                System.out.println("Count:" + value + "-" + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}
