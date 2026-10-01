package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExampl extends RecursiveTask<Integer> {

    private int start;
    private int end;

    public ForkJoinExampl(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    protected Integer compute() {

        if(end - start <= 2){
            int sum = 0;

            for (int i = start; i<= end; i++){
                sum += i;
            }

            return sum;
        }

        int middle = (start + end) / 2;
        ForkJoinExampl leftTask = new ForkJoinExampl(start, middle);
        ForkJoinExampl rightTask = new ForkJoinExampl(middle + 1, end);


        leftTask.fork();
        int rightResult = rightTask.compute();
        int leftResult = leftTask.join();
        return leftResult + rightResult;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinExampl task = new ForkJoinExampl(1, 10);

        int result = forkJoinPool.invoke(task);

        System.out.println("Sum:" + result);

        forkJoinPool.shutdown();
    }

}
