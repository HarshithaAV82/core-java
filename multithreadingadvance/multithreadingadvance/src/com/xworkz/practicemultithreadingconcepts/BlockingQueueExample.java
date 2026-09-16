package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            try {

                for (int i = 1; i <= 5; i++) {
                    queue.put(i);
                    System.out.println("Produced:" + i);
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        executorService.submit(() -> {

            try {
                for (int i = 1; i <= 5; i++) {

                    int value = queue.take();

                    System.out.println("Consumed:" + value);
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
    }
}
