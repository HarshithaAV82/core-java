package com.xworkz.Movie;

public class Cinimea extends Movie {

    int rating;
    boolean hit;

    public Cinimea(String title, int duration, String[] actors, MovieCompany company, MovieType type,
                   int rating, boolean hit) {

        super(title, duration, actors, company, type);
        this.rating = rating;
        this.hit = hit;
    }

    @Override
    public void play() {
        System.out.println("Child play movie");
    }

    @Override
    public void stop() {
        System.out.println("Child stop movie");
    }

    @Override
    public String toString() {
        return super.toString() + ", Rating: " + rating + ", Hit: " + hit;
    }
}