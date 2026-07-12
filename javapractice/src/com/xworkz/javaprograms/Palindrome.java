package com.xworkz.javaprograms;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Read the String
        System.out.println("Enter a String");
        String word = scanner.nextLine();

        //Create reverse string
        String reverse = "";

        //Reverse the string
        for (int i = word.length()-1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }

        //Compare original and reverse
        if (word.equals(reverse)){

            //print result
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
