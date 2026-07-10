package com.xworkz.javaprograms;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the string
        System.out.println("Enter a String");
        String word = scanner.nextLine();

        // Step 2: Traverse from last index to first index
        for (int i = word.length() - 1; i >= 0; i--){

            // Step 3: Print each character
            System.out.println(word.charAt(i));
        }
        // Step 4: Move to next line
        System.out.println();
    }
}
