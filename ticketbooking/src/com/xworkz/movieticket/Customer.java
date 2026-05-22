import booking.*;
import theatre.*;
import java.util.ArrayList;

// Parent Class
class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

// Child Class
class MovieBooking extends Customer
        implements BookingService {

    Ticket ticket;

    MovieBooking(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    public void bookTicket() {
        System.out.println(
                name + " booked successfully");
    }
}

// Thread
class Notification extends Thread {
    public void run() {
        System.out.println(
                "Booking Notification Sent");
    }
}

public class MovieSystem {

    public static void main(String[] args) {

        ArrayList<Ticket> list =
                new ArrayList<>();

        Ticket t1 =
                new Ticket(101,"Kantara");

        list.add(t1);

        PVR p = new PVR();
        p.theatreType();

        MovieBooking m =
                new MovieBooking("Harshitha", t1);

        m.bookTicket();
        t1.display();

        System.out.println(
                "Total Tickets: " +
                        Ticket.totalTickets);

        Notification n =
                new Notification();
        n.start();
    }
}