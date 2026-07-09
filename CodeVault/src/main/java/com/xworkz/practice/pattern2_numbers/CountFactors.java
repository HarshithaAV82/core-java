package com.xworkz.practice.pattern2_numbers;

import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        // Step 2: Create count variable
        int count = 0;

        // Step 3: Traverse from 1 to number
        for(int i = 1; i <= num; i++){

            // Step 4: Check divisibility
            if (num % i == 0){

                // Step 5: Increment count
                count++;
            }
        }

        System.out.println("Number of Fcators:" + count);
    }
}
