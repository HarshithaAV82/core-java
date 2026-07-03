package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class MergeTwoArrays {

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
        int[] arr2 = new int[n2];

        // Step 6: Store second array elements
        System.out.println("Enter the second array elements");

        for (int i = 0; i < n2; i++){

            arr2[i] = scanner.nextInt();
        }

        // Step 7: Create merged array
        int[] mergedArry = new int[n1 + n2];

        // Step 8: Copy first array
        for (int i = 0; i < n1; i++){
            mergedArry[i] = arr1[i];
        }

        // Step 9: Copy second array
        for (int i = 0; i < n2; i++){
            mergedArry[n1 + i] = arr2[i];
        }

        // Step 11: Print merged and sorted array
        System.out.println("Merged Array:");

        for (int i = 0; i < mergedArry.length; i++){
            System.out.println(mergedArry[i] + " ");
        }

    }
}


//   Step 10: Sort merged array in ascending order
//        for (int i = 0; i < mergedArray.length; i++) {
//
//            for (int j = i + 1; j < mergedArray.length; j++) {
//
//                if (mergedArray[i] > mergedArray[j]) {
//
//                    int temp = mergedArray[i];
//                    mergedArray[i] = mergedArray[j];
//                    mergedArray[j] = temp;
//                }
//            }
//        }