package com.xworkz.Belt;

public class BeltDetails extends Belt{
        boolean strong;
        int price;

        public BeltDetails(String color, int size, String[] styles, BeltBrand brand, BeltType type, boolean strong, int price) {
            super(color, size, styles, brand, type);
            this.strong = strong;
            this.price = price;
        }

        public void wear() {
            System.out.println("Child is wearing the belt...");
        }
        public void remove() {
            System.out.println("Child removing is the belt..");
        }

        public String toString() {
            return super.toString() + ", " + strong + ", " + price;
        }
    }
