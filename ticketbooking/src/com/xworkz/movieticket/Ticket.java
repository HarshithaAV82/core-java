package com.xworkz.movieticket;

public class Ticket {

    private int ticketId;
    private String movieName;
    private double price;

    public static int totalTickets = 0;

    public Ticket(int ticketId,
                  String movieName,
                  double price) {

        this.ticketId = ticketId;
        this.movieName = movieName;
        this.price = price;
        totalTickets++;
    }

    public void displayTicket() {

        System.out.println(
                "Ticket ID: " + ticketId);

        System.out.println(
                "Movie Name: " + movieName);

        System.out.println(
                "Price: " + price);
    }
}