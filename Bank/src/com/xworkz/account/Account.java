package com.xworkz.account;

public class Account {

    private  int accNo;
    private String name;
    private double balance;

    Account(int accNo, String name, double balance){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println(amount + "deposited");
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + "withdraw");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("AccNo: " + accNo + ", Name:" + name + ", Balance: " + balance);
    }
}
