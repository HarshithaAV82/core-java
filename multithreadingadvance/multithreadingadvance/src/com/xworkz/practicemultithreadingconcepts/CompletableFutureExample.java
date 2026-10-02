package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

            System.out.println("Task is running in:" + Thread.currentThread().getName());
            return "Task Completed";
        });

        String res = future.join();

        System.out.println("Result:" + res);
    }
}
