package com.xworkz.ability;

import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int add1 = scanner.nextInt();

        System.out.println("Enter the Second number:");
        int add2 = scanner.nextInt();

        System.out.println("Enter your choices + - * /");
        char choice = scanner.next().charAt(0);

        switch (choice){
            case '+':
                System.out.println(add1 + add2);
                break;
            case '-':
                System.out.println(add1 - add2);
                break;
            case '*':
                System.out.println(add1 * add2);
                break;
            case '/':
                System.out.println(add1 / add2);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
