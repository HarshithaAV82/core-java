package com.xworkz.smart.inner;

public interface BookingService {

    String SERVICE_TYPE = "Transport";
    int TOTAL_SEATS = 60;

    void bookTicket();
    void cancelTicket();
    void viewBookingDetails();
}
