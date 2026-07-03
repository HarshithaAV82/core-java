package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 4: Traverse array from last index
        for (int i = n - 1; i >= 0; i--) {

            // Step 5: Print elements
            System.out.print(arr[i] + " ");
        }
    }
}