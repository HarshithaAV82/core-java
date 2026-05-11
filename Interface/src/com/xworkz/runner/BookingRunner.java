package com.xworkz.runner;
import com.xworkz.inner.BookingService;
import com.xworkz.outer.RedBus;

public class BookingRunner {
    public static void main(String[] args) {

        BookingService bookingService = new RedBus();
        bookingService.bookTicket();
        bookingService.cancelTicket();
        bookingService.bookingStatus();
        bookingService.paymentStatus();

        BookingService.serviceInfo();
    }
}