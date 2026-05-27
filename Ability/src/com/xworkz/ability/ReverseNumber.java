package com.xworkz.ability;

public class ReverseNumber {

    public static void main(String[] args) {

        int originalNumber = 176532;
        int reversed = 0;

        while(originalNumber != 0){

            int digit = originalNumber % 10;
            reversed = reversed * 10 + digit;
            originalNumber = originalNumber / 10;
        }

        System.out.println(reversed);
    }
}