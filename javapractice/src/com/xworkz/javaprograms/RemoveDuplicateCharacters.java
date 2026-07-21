package com.xworkz.javaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        Set<Character> set = new LinkedHashSet<>();

        for(int i = 0; i < word.length(); i++){
            set.add(word.charAt(i));
        }

        System.out.println("String after removing duplicates:");

        set.forEach(System.out::println);
    }
}
