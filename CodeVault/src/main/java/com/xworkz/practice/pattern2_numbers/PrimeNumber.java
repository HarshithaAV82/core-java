package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Step 2: Create count variable
        int count = 0;

        // Step 3: Traverse from 1 to number
        for (int i = 1; i <= number; i++){

            // Step 4: Check divisibility
            if (number % i == 0){

                // Step 5: Increment factor count
                count++;
            }
        }
        // Step 6: Check whether factor count is 2
        if(count == 2){

            // Step 7: Print result
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }
    }
}
