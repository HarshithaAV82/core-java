package com.xworkz.movieticket;

class MovieBooking extends Customer
        implements BookingService {

    Ticket ticket;

    MovieBooking(String customerName,
                 Ticket ticket) {

        super(customerName);
        this.ticket = ticket;
    }

    public void bookTicket() {

        System.out.println(
                customerName +
                        " booked movie ticket");
    }
}
