package com.xworkz.ability;

public class DigitsAndSpecialCharacters {

    public static void main(String[] args) {

        String str = "Java123@#";

        int digits = 0;
        int specialCharacters = 0;
        int upperCase = 0;
        int lowerCase = 0;

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                digits++;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                upperCase++;

            }
            else if (ch >= 'a' && ch <= 'z') {
               lowerCase++;

            }



            //else if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') &&
              //      ch != ' '){
                //specialCharacters++;

            //
            // }
            else {
                specialCharacters++;
            }
        }

        System.out.println("Digits:" + digits);
        System.out.println("Special Characwters:" + specialCharacters);
        System.out.println("upperCase:" + upperCase);
        System.out.println("LowerCase:" + lowerCase);
    }
}
