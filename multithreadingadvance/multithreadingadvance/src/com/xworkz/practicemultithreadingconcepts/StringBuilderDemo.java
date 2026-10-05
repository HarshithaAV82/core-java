package com.xworkz.practicemultithreadingconcepts;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.replace(5, 13, "Coding");
        System.out.println("After replace: " + sb);

        sb.delete(5, 12);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());

        String result = sb.toString();
        System.out.println("As String: " + result);
    }
}