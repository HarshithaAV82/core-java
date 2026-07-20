package com.xworkz.javaprograms;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Read the string
        System.out.println("Enter a String");
        String word = sc.nextLine();

        // Step 3: Repeat until the string becomes empty
        while (!word.isEmpty()){

            // Step 4: Get the first character of the string
            char ch = word.charAt(0);

            // Step 5: Find the original length of the string
            int originalLength = word.length();

            // Step 6: Remove all occurrences of the current character
            word = word.replace(String.valueOf(ch), "");

            // Step 7: Find the new length of the string
            int newLength = word.length();

            // Step 8: Print the character and its frequency
            System.out.println(ch + ":" + (originalLength - newLength));
        }
    }
}
