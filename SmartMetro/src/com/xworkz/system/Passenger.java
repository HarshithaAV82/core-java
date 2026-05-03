package com.xworkz.system;

public class Passenger extends User{

    private double balance;

    public Passenger(String name, int id, double balance) {
        super(name, id);
        this.balance=balance;
    }

    public void recharge(double amount){
        balance += amount;
        System.out.println("Recharged:" + amount);
    }

    @Override
    void showRole() {
        System.out.println("Role: passenger");
    }

    public void showBalance(){
        System.out.println("Balance:" + balance);
    }
}
