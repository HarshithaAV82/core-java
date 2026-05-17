package com.xworkz.movie;

class MovieTicket {

    String movieName;
    int ticketCount;
    double ticketPrice;

    MovieTicket(String movieName, int ticketCount, double ticketPrice) {

        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.ticketPrice = ticketPrice;
    }


    double calculateAmount() {

        return ticketCount * ticketPrice;
    }

    void checkOffer() {

        if (ticketCount >= 5) {
            System.out.println("Offer Applied: Free Popcorn");
        } else {
            System.out.println("No Offer Available");
        }
    }

    void displayDetails() {

        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + ticketCount);
        System.out.println("Ticket Price: " + ticketPrice);

        System.out.println("Total Amount: " + calculateAmount());

        checkOffer();
    }
}

public class MovieBookingApp {

    public static void main(String[] args) {

        MovieTicket m1 = new MovieTicket("Leo", 3, 250);
        MovieTicket m2 = new MovieTicket("KGF", 6, 200);

        m1.displayDetails();
        m2.displayDetails();
    }
}