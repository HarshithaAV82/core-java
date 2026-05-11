package com.xworkz.inner;

public interface BookingService {

   public static final String SERVICE_TYPE = "Transport";
    int TOTAL_SEATS = 60;
    double TICKET_PRICE = 450.50;

    void bookTicket();
    void cancelTicket();

    default void bookingStatus() {
        System.out.println("running bookingStatus in BookingService");
    }

    default void paymentStatus() {
        System.out.println("running paymentStatus in BookingService");
    }

    static void serviceInfo() {
        System.out.println("running serviceInfo in BookingService");
    }
}