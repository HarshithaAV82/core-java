package com.xworkz.javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        // First loop - Count frequency
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Second loop - Find first non-repeated character
        for (int j = 0; j < word.length(); j++) {

            char chh = word.charAt(j);

            if (map.get(chh) == 1) {

                System.out.println("First Non-Repeated Character : " + chh);
                return;
            }
        }

        System.out.println("No Non-Repeated Character Found");
    }
}