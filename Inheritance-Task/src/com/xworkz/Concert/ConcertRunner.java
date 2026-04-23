package com.xworkz.Concert;
public class ConcertRunner{
        public static void main(String[] args) {
            Organizer org = new Organizer("suma", "Bangalore");
            String[] singers = {"Arijit", "Sonu"};
            Concert concert = new Concert("Music Night", 500, singers, org, ConcertType.LIVE);
            concert.start();
            concert.end();
            System.out.println(concert);
            ConcertDetails details = new ConcertDetails("Live Show", 800, singers, org, ConcertType.DJ, true, 3);
            details.start();
            details.end();
            System.out.println(details);
        }
    }

