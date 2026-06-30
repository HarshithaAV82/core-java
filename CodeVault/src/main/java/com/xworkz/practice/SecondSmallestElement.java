package com.xworkz.practice;

import java.util.Scanner;

public class SecondSmallestElement {

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

        // Step 4: Assume first element is smallest
        int smallest = arr[0];

        // Step 5: Assume secondSmallest is the largest possible value
        int secondSmallest = Integer.MAX_VALUE;

        // Step 6: Traverse the array
        for (int i = 1; i < n; i++){

            // Step 7: If current element is smaller than smallest
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // Step 8: If current element lies between smallest and secondSmallest
            else if (arr[i] < secondSmallest && arr[i] != smallest) {

                secondSmallest = arr[i];
            }

        }

        // Step 9: Print second smallest element
        System.out.println("Second Smallest Element:" + secondSmallest);

    }
}
