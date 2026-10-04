package com.xworkz.practicemultithreadingconcepts;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String name = "Java Programming";

        System.out.println("Original: " + name);

        System.out.println("Substring: " + name.substring(0, 4));

        System.out.println("Contains: " + true);

        System.out.println("Index of a: " + name.indexOf('a'));

        System.out.println("Replace: " + name.replace('a', 'o'));

        String text = "  Hello Java  ";
        System.out.println("Trim: '" + text.trim() + "'");
    }
}