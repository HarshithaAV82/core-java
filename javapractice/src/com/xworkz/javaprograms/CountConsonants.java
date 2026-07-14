package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountConsonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the string
        System.out.println("Enter a String");
        String word = scanner.nextLine();

        // Step 2: Create count variable
        int count = 0;

        // Step 3: Traverse the string
        for (int i = 0; i < word.length(); i++) {

            // Step 4: Convert character to lowercase
            char ch = Character.toLowerCase(word.charAt(i));

            // Step 5 & 6: Check alphabet and not a vowel
            if (ch >= 'a' && ch <= 'z' &&
                    ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' &&
                    ch != 'u') {

                // Step 7: Increment count
                count++;
            }
        }
        // Step 8: Print result
        System.out.println("Number of Consonants: " + count);
    }
}