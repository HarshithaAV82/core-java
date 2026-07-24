package com.xworkz.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second string");
        String word2 = scanner.nextLine();

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1,array2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
