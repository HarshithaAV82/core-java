package com.xworkz.ability;

import java.util.Scanner;

public class SecretNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int SecretNumber = 7;
        System.out.println("Enter the number");
        int guess = scanner.nextInt();

        if(guess == SecretNumber){
            System.out.println("The guess Number is correct" + SecretNumber);
        }
        else {
            System.out.println("The guess Number is wrong:" + guess);
        }
    }
}
