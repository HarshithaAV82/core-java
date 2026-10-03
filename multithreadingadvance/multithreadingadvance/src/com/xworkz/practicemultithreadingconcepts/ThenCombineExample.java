package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.CompletableFuture;

public class ThenCombineExample {

    public static void main(String[] args) {

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {

            return 10;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {

            return 20;
        });

        CompletableFuture<Integer> res = future1.thenCombine(future2, Integer::sum);

        System.out.println("Result:" + res.join());
    }
}
