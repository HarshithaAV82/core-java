package com.xworkz.ability;

public class Palindrome {

    public static void main(String[] args) {

        int original = 121;
        int num = original;
        int reversed = 0;

        while(num != 0){

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(original == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}