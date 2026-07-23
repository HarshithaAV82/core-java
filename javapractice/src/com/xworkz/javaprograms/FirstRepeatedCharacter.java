package com.xworkz.javaprograms;

import java.util.Scanner;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read the string
        System.out.println("Enter a string");
        String word = scanner.nextLine();

        // Step 3: Create an empty string
        String result = "";

        // Step 4: Traverse the string
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            // Step 5: Check whether character already exists
            if (result.contains(String.valueOf(ch))){

                System.out.println("First Repeated Character:" + ch);
                return;
            }
            // Step 6: Add character to result
            result = result + ch; //result.append(ch);
        }

        System.out.println("No Repeated Character Found");
    }
}
