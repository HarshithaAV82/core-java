package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class MoveZerosToEnd {

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

        // Step 4: Create index variable
        int index = 0;

        // Step 5: Traverse the array
        for (int i = 0; i < n; i ++){

            // Step 6: Check whether the element is non-zero
            if(arr[i] != 0){

                // Step 7: Move the non-zero element to the front
                arr[index] = arr[i];

                // Step 8: Move index to the next position
                index++;
            }
        }
        // Step 9: Fill the remaining positions with zeros
        while (index < n){
            arr[index] = 0;
            index++;
        }
        // Step 10: Print the updated array
        System.out.println("Array after moving zeros to end:");

        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}