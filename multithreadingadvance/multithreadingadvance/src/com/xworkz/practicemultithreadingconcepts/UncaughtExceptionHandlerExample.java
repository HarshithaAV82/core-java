package com.xworkz.practicemultithreadingconcepts;

public class UncaughtExceptionHandlerExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Thread started...");
            int res = 10/0;
            System.out.println(res);
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Exception occurred in: "+ t.getName() );
            System.out.println("Exception:" + e.getMessage());
        } );
        thread.start();
    }
}
