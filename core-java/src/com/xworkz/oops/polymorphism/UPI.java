package com.xworkz.oops.polymorphism;

public class UPI extends Payment {

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}