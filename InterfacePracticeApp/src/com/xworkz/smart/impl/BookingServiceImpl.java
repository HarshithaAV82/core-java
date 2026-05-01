package com.xworkz.smart.impl;

import com.xworkz.smart.inner.BookingService;

public class BookingServiceImpl  implements BookingService {


    @Override
    public void bookTicket() {
        System.out.println("Ticket booked successfully");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancelled successfully");
    }

    @Override
    public void viewBookingDetails() {
        System.out.println("Displaying booking details");
    }
}
