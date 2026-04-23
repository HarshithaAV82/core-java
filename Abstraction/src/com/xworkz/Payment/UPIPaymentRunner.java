package com.xworkz.Payment;

public class UPIPaymentRunner{
    public static void main(String[] args) {
        UPIPayment upiPayment = new UPIPayment();
        upiPayment.processTransaction();
        upiPayment.validateDetails();
        upiPayment.generateReceipt();
    }
}
