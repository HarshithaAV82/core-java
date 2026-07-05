package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Step 2: Create product variable
        int product = 1;

        // Step 3: Repeat until number becomes 0
        while (number != 0){

            // Step 4: Find last digit
            int digit = number % 10;

            // Step 5: Multiply digit with product
            product = product * digit;

            // Step 6: Remove last digit
            number = number / 10;
        }

        // Step 7: Print product
        System.out.println("Product of digits:" + product);
    }
}
