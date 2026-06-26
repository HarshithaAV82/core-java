package com.xworkz.practice;

import java.util.Scanner;

public class CountGreaterThan50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // Step 4: Create count variable
        int count = 0;

        // Step 5: Traverse array
        for (int i = 0; i < n; i++){

            // Step 6: Check whether element is greater than 50
            if (arr[i] > 50){

                // Step 7: Increment count
                count++;
            }
        }
        // Step 8: Print count
        System.out.println("Number of elements greater than 50:" + count);
    }
}
