package com.xworkz.Payment;

public interface Payment{

    void validateDetails();

    void processTransaction();

    default void generateReceipt(){
        System.out.println("receipt generate for amount...");
        System.out.println("thank you for using our service...");
    }
}
