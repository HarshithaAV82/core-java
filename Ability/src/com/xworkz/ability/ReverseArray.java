package com.xworkz.ability;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        System.out.println("Reversed Array:");

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}