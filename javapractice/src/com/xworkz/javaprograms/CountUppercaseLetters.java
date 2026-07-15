package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountUppercaseLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < word.length(); i++){

            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){

                count++;
            }
        }

        System.out.println("Number of Uppercase Letters:" + count);
    }
}
//if (Character.isUpperCase(ch)) {
//    count++;
//}