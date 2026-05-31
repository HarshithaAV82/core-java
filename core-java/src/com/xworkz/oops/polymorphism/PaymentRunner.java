package com.xworkz.oops.polymorphism;

public class PaymentRunner {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPI();
        payment.pay();

        payment = new Card();
        payment.pay();
    }
}