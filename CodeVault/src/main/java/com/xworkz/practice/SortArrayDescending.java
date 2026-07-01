package com.xworkz.practice;

import java.util.Scanner;

public class SortArrayDescending {

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

        // Step 4: Traverse array
        for (int i =0; i < n; i++){

            // Step 5: Compare remaining elements
            for (int j = i + 1; j < n; j++){

                // Step 6: Compare
                if (arr[i] < arr[j]){

                    // Step 7: Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 8: Print sorted array
        System.out.println("Array in Descending Order:");

        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
           }
}
