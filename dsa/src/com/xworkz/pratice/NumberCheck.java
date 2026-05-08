package com.xworkz.pratice;
import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if(number > 0) {
            System.out.println(number + " is Positive");
        }
        else if(number < 0) {
            System.out.println(number + " is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}