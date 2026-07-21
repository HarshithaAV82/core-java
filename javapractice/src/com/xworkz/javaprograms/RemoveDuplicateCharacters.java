package com.xworkz.javaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read the string
        System.out.println("Enter a string");
        String word = scanner.nextLine();

        // Step 3: Create LinkedHashSet
        Set<Character> set = new LinkedHashSet<>();

        // Step 4: Add each character into the set
        for(int i = 0; i < word.length(); i++){
            set.add(word.charAt(i));
        }
        // Step 5: Print the characters
        System.out.println("String after removing duplicates:");

        set.forEach(System.out::println);
    }
}
//Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a string");
//        String word = scanner.nextLine();
//
//        String result = "";
//
//        for (int i = 0; i < word.length(); i++) {
//
//            char ch = word.charAt(i);
//
//            if (!result.contains(String.valueOf(ch))) {
//
//                result = result + ch;
//            }
//        }
//
//        System.out.println("After Removing Duplicates : " + result);