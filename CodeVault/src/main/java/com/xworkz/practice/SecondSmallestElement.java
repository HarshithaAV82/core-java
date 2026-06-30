package com.xworkz.practice;

import java.util.Scanner;

public class SecondSmallestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++){

            arr[i] = scanner.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++){

            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {

                secondSmallest = arr[i];
            }

        }

        System.out.println("Second Smallest Element:" + secondSmallest);

    }
}
