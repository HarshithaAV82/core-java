package com.xworkz.Concert;

public class Organizer{
        String name;
        String city;

        public Organizer(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String toString() {
            return name + ", " + city;
        }
    }
