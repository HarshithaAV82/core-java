package com.xworkz.method;

public class StringClass {

    public static void main(String[] args) {

         String name = "Harshitha";

        String lower = name.toLowerCase();
        System.out.println("Lower Case: " + lower);

        String upper = name.toUpperCase();
        System.out.println("Upper Case: " + upper);

        int length = name.length();
        System.out.println("Length: " + length);

         char character = name.charAt(2);
         System.out.println("Character at index 2: " + character);

         String sub = name.substring(0, 5);
         System.out.println("Substring (0-5): " + sub);

        String replaced = name.replace("Harshi","Hema");
        System.out.println("Replaced: " + replaced);

        boolean isEqual = name.equals("Harshitha");
        System.out.println("Equals check: " + isEqual);

         boolean contains = name.contains("shi");
        System.out.println("Contains 'shi': " + contains);

        boolean start = name.startsWith("Har");
        System.out.println("Starts with 'Har': " + start);

         boolean end = name.endsWith("tha");
         System.out.println("Ends with 'tha': " + end);

        String value = String.valueOf(name);
        System.out.println("ValueOf: " + value);

        String formatted = String.format("My name is %s" ,  name); // use + symbol without use %s
        System.out.println("Formatted: " + formatted);

       String joined = String.join(".", "Java", "String", "Methods");
       System.out.println("Joined: " + joined);

    }
}