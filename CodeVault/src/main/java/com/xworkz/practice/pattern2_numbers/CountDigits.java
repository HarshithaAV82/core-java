package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        // Step 2: Create count variable
        int count = 0;

        // Step 3: Repeat until number becomes 0
        while (num != 0){

            // Step 4: Remove last digit
            num = num/10;
            count++;
        }
        // Step 6: Print count
        System.out.println("Number of digits:" + count);
    }
}
