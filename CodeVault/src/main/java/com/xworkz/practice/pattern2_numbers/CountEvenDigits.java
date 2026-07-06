package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class CountEvenDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int count = 0;

        while (num != 0){

            int digit = num % 10;

            if(digit % 2 == 0){

                count++;
            }

            num = num / 10;
        }

        System.out.println("Number of even digits:" + count);
    }
}
