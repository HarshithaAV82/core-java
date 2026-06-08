package com.xworkz.ability;

public class UpperLowerCaseCount {

    public static void main(String[] args) {

        String str = "Java Programming";

        int upperCase = 0;
        int lowerCase = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                upperCase++;

            else if(Character.isLowerCase(ch))
                lowerCase++;
        }

        System.out.println("Uppercase Letters: " + upperCase);
        System.out.println("Lowercase Letters: " + lowerCase);
    }
}