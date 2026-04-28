package com.xworkz.account;

public class BankApp {

    public static void main(String[] args) {

        Account account = new Account(101, "Harshitha A V", 100000);

        account.display();
        account.deposit(5000);
        account.withdraw(5333);
        account.withdraw(8777);
    }
}
