package com.xworkz.ability;

import java.util.Arrays;

public class EvenOrOdd {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5, 7, 8, 6, 9};

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }
}