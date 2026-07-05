package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int largest = 0;

        while (num != 0){

            int digit = num % 10;

            if(digit > largest){
                largest = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest Digit:" + largest);
    }
}
