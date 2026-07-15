package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountDigitsInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the string
        System.out.println("Enter a String");
        String word = scanner.nextLine();

        // Step 2: Create count variable
        int count = 0;

        // Step 3: Traverse the string
        for (int i = 0; i < word.length(); i++){

            // Step 4: Get each character
            char ch = word.charAt(i);

            // Step 5: Check whether it is a digit
            if (ch >= '0' && ch <= '9'){

                // Step 6: Increment count
                count++;
            }
        }

        // Step 7: Print result
        System.out.println("Number of Digits:" + count);
    }
}
