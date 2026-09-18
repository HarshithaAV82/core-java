package com.xworkz.practicemultithreadingconcepts;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerOperationsExample {

    public static void main(String[] args) {

        AtomicInteger number = new AtomicInteger(10);
        System.out.println("Initial value:" + number.get());
        System.out.println("After increment:" + number.incrementAndGet());
        System.out.println("After decrement:" + number.decrementAndGet());
        System.out.println("After adding 5:" + number.addAndGet(5));
        number.set(50);
        System.out.println("After set:" + number.get());
    }
}
