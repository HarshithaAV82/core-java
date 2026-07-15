package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountUppercaseLetters {

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

            // Step 5: Check whether it is uppercase
            if (ch >= 'A' && ch <= 'Z'){

                // Step 6: Increment count
                count++;
            }
        }

        // Step 7: Print result
        System.out.println("Number of Uppercase Letters:" + count);
    }
}
//if (Character.isUpperCase(ch)) {
//    count++;
//}