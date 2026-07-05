package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class SmallestDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int smallest = 9;

        while (num != 0){

            int digit = num % 10;

            if (digit < smallest){

                smallest = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest Digit:" + smallest);
    }
}
