package com.xworkz.Belt;

public class BeltBrand{
        String name;
        String place;

        public BeltBrand(String name, String place) {
            this.name = name;
            this.place = place;
        }

        public String toString() { return name + ", " + place; }
    }
