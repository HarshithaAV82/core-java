package com.xworkz.ability;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 5000;

        System.out.println("1. Balance Check");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Enter choice:");

        int choice = scanner.nextInt();

        switch(choice){

            case 1:
                System.out.println("Balance is: " + balance);
                break;

            case 2:
                System.out.println("Enter deposit amount:");
                int deposit = scanner.nextInt();
                balance = balance + deposit;
                System.out.println("Updated balance: " + balance);
                break;

            case 3:
                System.out.println("Enter withdraw amount:");
                int withdraw = scanner.nextInt();

                if(withdraw <= balance){
                    balance = balance - withdraw;
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}