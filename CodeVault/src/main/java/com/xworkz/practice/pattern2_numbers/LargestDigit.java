package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        // Step 2: Create largestvariable
        int largest = 0;

        // Step 3: Repeat until number becomes 0
        while (num != 0){

            // Step 4: Find last digit
            int digit = num % 10;

            // Step 5: Compare digit with largest
            if(digit > largest){

                // Step 6: Update largest
                largest = digit;
            }

            // Step 6: Update largest
            num = num / 10;
        }

        // Step 8: Print largest digit
        System.out.println("Largest Digit:" + largest);
    }
}
