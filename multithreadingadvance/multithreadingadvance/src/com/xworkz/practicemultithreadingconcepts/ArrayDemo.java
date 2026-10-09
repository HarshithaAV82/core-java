package com.xworkz.practicemultithreadingconcepts;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 85, 95};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Second mark: " + marks[1]);
        System.out.println("Third mark: " + marks[2]);

        System.out.println("Array length: " + marks.length);

        System.out.println("All marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}