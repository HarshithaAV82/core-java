package com.xworkz.Plate;

public class PlateBrand{
        String name;
        String place;

        public PlateBrand(String name, String place) {
            this.name = name;
            this.place = place;
        }

        public String toString() { return name + ", " + place; }
    }
