package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        System.out.println("Factors are:");

        // Step 2: Traverse from 1 to number
        for (int i = 1; i <= num; i++){

            // Step 3: Check divisibility
            if (num % i == 0){

                // Step 4: Print factor
                System.out.println(i);
            }
        }
    }
}
