package com.xworkz.practice;

import java.util.Scanner;

public class ArrayPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        boolean isPalindrome = true;

        for (int i = 0; i < n/2; i++){

            if (arr[i] != arr[n - 1 - i]){

                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Array is palindrome");
        }
        else {
            System.out.println("Array is not palindrome");
        }
    }
}
