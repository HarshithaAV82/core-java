package com.xworkz.helmet;

import java.util.Arrays;

public class Helmet{

        boolean isCompulsory;
        double price;
        String[] colors;
        HelmetBrand brand;
        HelmetType type;

        public Helmet(boolean isCompulsory, double price, String[] colors, HelmetBrand brand, HelmetType type) {
            this.isCompulsory = isCompulsory;
            this.price = price;
            this.colors = colors;
            this.brand = brand;
            this.type = type;
        }

        public void wearHelmet() {
            System.out.println("Executing wearHelmet in Helmet Class");
        }

        public void removeHelmet() {
            System.out.println("Executing removeHelmet in Helmet Class");
        }

        @Override
        public String toString() {
            return "isCompulsory: " + isCompulsory + ", Price: " + price + ", Colors: " + Arrays.toString(colors) + ", Brand: " + brand + ", Type: " + type;
        }
    }

