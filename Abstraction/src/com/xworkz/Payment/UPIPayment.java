package com.xworkz.Payment;

public class UPIPayment implements Payment{

    @Override
    public void validateDetails() {
        System.out.println("execute the validate details in payment...");
    }

    @Override
    public void processTransaction() {
        System.out.println("execute the processTransaction in payment.....");
    }
}
