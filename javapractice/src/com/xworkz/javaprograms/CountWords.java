package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the string
        System.out.println("Enter a string");
        String word = scanner.nextLine();

        // Step 2: Remove leading and trailing spaces
        word = word.trim();

        // Step 3: Create count variable
        int count = 0;

        // Step 4: Check empty string
        if (word.isEmpty()) {

            count = 0;
        } else {
            // Step 5: First word
            count = 1;

            // Step 6: Traverse the string
            for (int i = 0; i < word.length() - 1; i++) {

                // Step 7: Check for space followed by a character
                if (word.charAt(i) == ' ' && word.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }

        // Step 8: Print result
        System.out.println("Number of words:" + count);
    }
}
