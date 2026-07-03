package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class CommonElementsBetweenTwoArrays {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read size of first array
        System.out.println("Enter the size of first array");
        int n1 = scanner.nextInt();

        // Step 2: Create first array
        int[] arr1 = new int[n1];

        // Step 3: Store first array elements
        System.out.println("Enter the first array elements");

           for (int i = 0; i < n1; i++){
               arr1[i] = scanner.nextInt();
           }

        // Step 4: Read size of second array
        System.out.println("Enter the size of second array");
        int n2 = scanner.nextInt();

        // Step 5: Create second array
        int arr2[] = new int[n2];

        // Step 6: Store second array elements
        System.out.println("Enter the second array elements");

        for (int i = 0; i < n2; i++){
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Common Elements");

        // Step 7: Traverse first array
        for (int i = 0; i < n1; i++){

            // Step 8: Traverse second array
            for (int j = 0; j < n2; j++){

                // Step 9: Compare elements
                if(arr1[i] == arr2[j]){

                    // Step 10: Print common element
                    System.out.println(arr1[i]);
                    break;
                }
            }

        }
    }
}
