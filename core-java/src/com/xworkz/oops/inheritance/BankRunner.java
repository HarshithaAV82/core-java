package com.xworkz.oops.inheritance;

public class BankRunner {

    public static void main(String[] args) {

        SBI sbi = new SBI();

        System.out.println(sbi.location);
        sbi.accountType();
        sbi.loan();
    }
}