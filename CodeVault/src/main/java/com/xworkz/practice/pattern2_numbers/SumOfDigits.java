package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Step 2: Create sum variable
        int sum = 0;

        // Step 3: Repeat until number becomes 0
        while (number != 0){

            // Step 4: Find last digit
            int digit = number % 10;

            // Step 5: Add digit to sum
            sum = sum + digit;

            // Step 6: Remove last digit
            number = number / 10;
        }

        // Step 7: Print sum
        System.out.println("Sum of Digits:" + sum);
    }
}
