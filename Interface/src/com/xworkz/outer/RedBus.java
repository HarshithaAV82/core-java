package com.xworkz.outer;

import com.xworkz.inner.BookingService;

public class RedBus implements BookingService {

    public void bookTicket() {
        System.out.println("implemented bookTicket in RedBus");
    }

    public void cancelTicket() {
        System.out.println("implemented cancelTicket in RedBus");
    }
}