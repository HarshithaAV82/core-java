package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int originalNumber = number;

        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;

        }
            if (originalNumber == reverse){

                System.out.println("Palindrome Number");
            }else {
                System.out.println("Not a palindrome Number");
            }
        }
}
