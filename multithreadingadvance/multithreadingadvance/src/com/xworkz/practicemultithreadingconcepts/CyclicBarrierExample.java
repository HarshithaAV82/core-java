package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++){
            int taskNumber = i;
            executorService.submit(() -> {
                try {

                    System.out.println("Task" + taskNumber + "is waiting at barrier");

                    barrier.await();

                    System.out.println("Task" + taskNumber + "Continued after barrier");
                }catch (InterruptedException | BrokenBarrierException e){
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
    }
}
