package com.xworkz.practice;

import java.util.Scanner;

public class UniqueDuplicateFinder {


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
        System.out.println("Duplicate Elemnets:");

        // Step 4: Traverse the array
        for (int i = 0; i < n; i++) {

            // Step 5: Assume current element is not printed
            boolean alreadyPrinted = false;

            // Step 6: Check whether current element already appeared
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]){
                    alreadyPrinted = true;
                    break;
                }
            }

            // Step 7: Skip if duplicate is already printed
            if (alreadyPrinted){
                continue;
            }

            // Step 8: Compare current element with remaining elements
            for (int j = i + 1; j < n; j++){

                // Step 9: Check duplicate
                if (arr[i] == arr[j]){

                    // Step 10: Print duplicate element only once
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}