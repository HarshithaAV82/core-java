package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//public class ReverseString {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 1: Read the string
//        System.out.println("Enter a String");
//        String word = scanner.nextLine();
//
//        // Step 2: Traverse from last index to first index
//        for (int i = word.length() - 1; i >= 0; i--){
//
//            // Step 3: Print each character
//            System.out.println(word.charAt(i));
//        }
//        // Step 4: Move to next line
//        System.out.println();
//    }
//}


public class ReverseString{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        // Step 1: Create List
        List<Character> list = new ArrayList<>();

        // Step 2: Store characters in List
        for (int i = 0; i < word.length(); i++){
            list.add(word.charAt(i));
        }

        // Step 3: Reverse List
        Collections.reverse(list);

        // Step 4: Print reversed string
        System.out.println("Reverse String:");

        for (Character ch : list){

            System.out.println(ch);
        }
    }
}