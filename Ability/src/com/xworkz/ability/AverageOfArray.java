package com.xworkz.ability;

public class AverageOfArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int average = sum / arr.length;

        System.out.println("Average = " + average);
    }
}