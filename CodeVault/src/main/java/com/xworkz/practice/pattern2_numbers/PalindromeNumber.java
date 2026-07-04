package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Step 2: Store original number
        int originalNumber = number;

        // Step 3: Create reverse variable
        int reverse = 0;

        // Step 4: Repeat until number becomes 0
        while (number != 0) {

            // Step 5: Find last digit
            int digit = number % 10;

            // Step 6: Build reverse number
            reverse = reverse * 10 + digit;

            // Step 7: Remove last digit
            number = number / 10;

        }
        // Step 8: Compare original number with reverse
            if (originalNumber == reverse){

                // Step 9: Print result
                System.out.println("Palindrome Number");
            }else {
                System.out.println("Not a palindrome Number");
            }
        }
}
