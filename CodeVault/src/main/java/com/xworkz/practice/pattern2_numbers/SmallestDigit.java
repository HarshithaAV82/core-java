package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class SmallestDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        // Step 2: Create smallest variable
        int smallest = 9;

        // Step 3: Repeat until number becomes 0
        while (num != 0){

            // Step 4: Find last digit
            int digit = num % 10;

            // Step 5: Compare digit with smallest
            if (digit < smallest){

                // Step 6: Update smallest
                smallest = digit;
            }

            // Step 7: Remove last digit
            num = num / 10;
        }

        // Step 8: Print smallest digit
        System.out.println("Smallest Digit:" + smallest);
    }
}
