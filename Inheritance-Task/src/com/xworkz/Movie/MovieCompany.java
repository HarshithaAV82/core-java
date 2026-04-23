package com.xworkz.Movie;

public class MovieCompany{
        String name;
        String place;

        public MovieCompany(String name, String place) {
            this.name = name;
            this.place = place;
            System.out.println("Company: " + name + ", Place: " + place);
        }

        public String toString() {
            return name + ", " + place;
        }
    }
