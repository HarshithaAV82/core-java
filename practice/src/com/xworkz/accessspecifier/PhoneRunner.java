package com.xworkz.accessspecifier;

public class PhoneRunner {

    public static void main(String[] args) {

        Phone phone = new Phone();

        System.out.println(phone.brand);
        phone.call();

        System.out.println(phone.processor);
        phone.performance();

        System.out.println(phone.color);
        phone.displayColor();
    }
}