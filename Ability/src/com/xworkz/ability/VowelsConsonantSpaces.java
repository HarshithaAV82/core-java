package com.xworkz.ability;

public class VowelsConsonantSpaces {

    public static void main(String[] args) {

        String str = "Java Programming";

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for(int i=0; i < str.length(); i++){

            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;

            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);
        System.out.println("Spaces:" + spaces);
    }
}
