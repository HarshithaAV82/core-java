package com.xworkz.practice;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter the array elements");

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 4: Read the search element
        System.out.println("Enter the element to search");
        int search = scanner.nextInt();

        // Step 5: Create boolean variable
        boolean found = false;

        // Step 6: Traverse array
        for(int i = 0; i < n; i++) {

            // Step 7: Compare
            if(arr[i] == search) {

                // Step 8: Update
                found = true;
                break;
            }
        }

        // Step 9: Print result
        if(found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}