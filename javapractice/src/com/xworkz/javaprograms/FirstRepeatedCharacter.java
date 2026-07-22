package com.xworkz.javaprograms;

import java.util.Scanner;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        String result = "";

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if (result.contains(String.valueOf(ch))){

                System.out.println("First Repeated Character:" + ch);
                return;
            }
            result = result + ch;
        }

        System.out.println("No Repeated Character Found");
    }
}
