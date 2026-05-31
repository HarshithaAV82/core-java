package com.xworkz.oops.polymorphism;

public class Card extends Payment {

    @Override
    public void pay() {
        System.out.println("Payment through Card");
    }
}