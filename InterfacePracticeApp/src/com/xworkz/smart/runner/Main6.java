package com.xworkz.smart.runner;

import com.xworkz.smart.impl.BookingServiceImpl;
import com.xworkz.smart.inner.BookingService;

public class Main6 {

    public static void main(String[] args) {
        BookingService bookingService = new BookingServiceImpl();
        bookingService.bookTicket();
        bookingService.cancelTicket();
        bookingService.viewBookingDetails();

        System.out.println(BookingService.SERVICE_TYPE);
        System.out.println(BookingService.TOTAL_SEATS);
    }
}
