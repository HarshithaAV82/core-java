package com.xworkz.Concert;

import java.util.Arrays;

public class Concert {

        String name;
        int tickets;
        String[] singers;
        Organizer org;
        ConcertType type;

        public Concert(String name, int tickets, String[] singers, Organizer org, ConcertType type) {
            this.name = name;
            this.tickets = tickets;
            this.singers = singers;
            this.org = org;
            this.type = type;
        }

        public void start() {
            System.out.println("Venue are mentioned now Start concert");
        }
        public void end() {
            System.out.println("the concert is end...");
        }

        public String toString() {
            return name + ", " + tickets + ", " + Arrays.toString(singers) + ", " + org + ", " + type;
        }
    }
