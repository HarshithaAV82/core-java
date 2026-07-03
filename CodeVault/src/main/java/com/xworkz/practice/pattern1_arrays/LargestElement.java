package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class LargestElement {

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

        // Step 4: Assume first element is largest

        int largest = arr[0];

        // Step 5: Traverse array

        for (int i = 1; i < n; i++){

            // Step 6: Compare each element with largest

             if (arr[i] > largest){

                 // Step 7: Update largest
                 largest = arr[i];
             }

        }
        // Step 8: Print largest
        System.out.println("Largest element is:" + largest);
    }
}
