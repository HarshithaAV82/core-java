package com.xworkz.food;

public class Food {
        String name;
        int price;

        public Food(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void prepare() {
            System.out.println("Preparing food...");
        }

        public void info() {
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

