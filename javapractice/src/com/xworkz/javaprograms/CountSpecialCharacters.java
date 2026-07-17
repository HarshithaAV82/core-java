package com.xworkz.javaprograms;

import java.util.Scanner;

public class CountSpecialCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < word.length(); i++){

            char ch = word.charAt(i);

            if(!(ch >= 'A' && ch <= 'Z'
                 || ch >= 'a' && ch <= 'z'
                 || ch >= '0' && ch <= '9'
                  )){

                count++;
            }
        }

        System.out.println("Number of special Characters:" + count);
    }
}
//if (!Character.isLetterOrDigit(ch)) {
//    count++;
//}