package com.xworkz.practice;

import java.util.Scanner;

public class FindDuplicateElements {

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

        System.out.println("Duplicate Elements:");

        // Step 4: Outer Loop
        for (int i = 0; i < n; i++){

            // Step 5: Inner Loop
            for (int j = i + 1; j < n; j++){

                // Step 6: Compare elements
                if (arr[i] == arr[j]){

                    // Step 7: Print duplicate
                    System.out.println(arr[i]);

                    // Step 7: Print duplicate
                    break;
                }
            }
        }

    }

}
