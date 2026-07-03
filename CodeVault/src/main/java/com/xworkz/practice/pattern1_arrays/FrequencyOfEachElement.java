package com.xworkz.practice.pattern1_arrays;

import java.util.Scanner;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read n
        System.out.println("Enter the number of array");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Store array elements
        System.out.println("Enter tha array elemnets");

        for(int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Frequency of each element");

        // Step 4: Traverse array
        for (int i = 0; i < n; i++){


            // Step 5: Check whether element is already counted
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++){

                if (arr[i] == arr[k]){
                    alreadyCounted = true;
                     break;
                }
            }

            // Step 6: Skip already counted element
            if (alreadyCounted){
                continue;
            }
            // Step 7: Create count variable
            int count = 1;

            // Step 8: Compare with remaining elements
            for (int j = i + 1; j < n; j++){

                // Step 9: Increment count
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            // Step 10: Print frequency
            System.out.println(arr[i]  + " -> " + count);
        }
    }
}
