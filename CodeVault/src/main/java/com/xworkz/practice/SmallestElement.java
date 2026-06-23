package com.xworkz.practice;

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array to store:");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("add the array element in the array:");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        // Step 4: Assume first element is smallest
        int smallest = arr[0];

        // Step 5: Traverse array
        for (int i = 1; i < n; i++){
            // Step 6: Compare each element with smallest
            if(arr[i] < smallest){
                // Step 7: Update smallest
                smallest = arr[i];
            }
        }

        // Step 8: Print smallest
        System.out.println("The smallest element in the array is:" + smallest);
    }
}
