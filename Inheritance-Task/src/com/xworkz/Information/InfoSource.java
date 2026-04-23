package com.xworkz.Information;

public class InfoSource{
        String name;
        String place;

        public InfoSource(String name, String place) {
            this.name = name;
            this.place = place;
        }

        public String toString() {
            return name + ", " + place;
        }
    }

