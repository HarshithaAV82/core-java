package com.xworkz.practice;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            actualSum = actualSum + arr[i];
        }

        int expectedSum = (n + 1) * (n + 2) / 2;

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number:" + missingNumber);
    }
}