package com.xworkz.practice;

import java.util.Scanner;

public class RemoveElementFromArray {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // Step 4: Read element to remove
        System.out.println("Enter the element to remove");
        int removeElement = scanner.nextInt();

        System.out.println("Array after removing element:");

        // Step 5: Traverse array
        for (int i = 0; i < n; i++){

            // Step 6: Compare current element with remove element
            if(arr[i] != removeElement){

                // Step 7: Print remaining elements
                System.out.println(arr[i] + " ");
            }
        }

    }
}
