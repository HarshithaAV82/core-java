package com.xworkz.movieticket;

import java.util.ArrayList;

public class MovieBookingSystem {

    public static void main(String[] args) {

        ArrayList<Ticket> list = new ArrayList<>();

        Ticket t1 = new Ticket(101, "Kantara", 250);

        list.add(t1);

        // Abstraction + Overriding
        Multiplex m = new Multiplex();

        m.theatreType();

        // Inheritance + Interface
        MovieBooking b = new MovieBooking("Harshitha", t1);

        b.bookTicket();

        // Encapsulation
        t1.displayTicket();

        // Static
        System.out.println("Total Tickets: " + Ticket.totalTickets);

        // Multithreading
        Notification n = new Notification();

        n.start();
    }
}