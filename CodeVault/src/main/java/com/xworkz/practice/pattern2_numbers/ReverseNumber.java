package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter  a number");
        int number = scanner.nextInt();

        // Step 2: Create reverse variable
        int reverse = 0;

        // Step 3: Repeat until number becomes 0
        while(number != 0){

            // Step 4: Find last digit
            int digit = number % 10;

            // Step 5: Add digit to reverse
            reverse = reverse * 10 + digit;

            // Step 6: Remove last digit
            number = number / 10;
        }

        // Step 7: Print reverse number
        System.out.println("Reverse Number:" + reverse);
    }

}
