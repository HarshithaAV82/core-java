package com.xworkz.practice;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter the array elements");

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            // Step 4: Calculate actual sum
            actualSum = actualSum + arr[i];
        }

        // Step 5: Calculate expected sum
        int expectedSum = (n + 1) * (n + 2) / 2;

        // Step 6: Find missing number
        int missingNumber = expectedSum - actualSum;

        // Step 7: Print missing number
        System.out.println("Missing Number:" + missingNumber);
    }
}