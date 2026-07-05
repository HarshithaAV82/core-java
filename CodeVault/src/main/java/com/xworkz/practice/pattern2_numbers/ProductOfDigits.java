package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int product = 1;

        while (number != 0){

            int digit = number % 10;

            product = product * digit;

            number = number / 10;
        }

        System.out.println("Product of digits:" + product);
    }
}
