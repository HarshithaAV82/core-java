package com.xworkz.practice;

import java.util.Scanner;

public class ArrayPalindrome {

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

        // Step 4: Assume the array is palindrome
        boolean isPalindrome = true;

        // Step 5: Traverse only half of the array
        for (int i = 0; i < n/2; i++){

            // Step 6: Compare first and last elements
            if (arr[i] != arr[n - 1 - i]){

                // Step 7: Not a palindrome
                isPalindrome = false;
                break;
            }
        }
        // Step 8: Print the result
        if(isPalindrome){
            System.out.println("Array is palindrome");
        }
        else {
            System.out.println("Array is not palindrome");
        }
    }
}
