package com.xworkz.Belt;
import java.util.Arrays;
    public class Belt {
        String color;
        int size;
        String[] styles;
        BeltBrand brand;
        BeltType type;

        public Belt(String color, int size, String[] styles, BeltBrand brand, BeltType type) {
            this.color = color;
            this.size = size;
            this.styles = styles;
            this.brand = brand;
            this.type = type;
        }

        public void wear() {
            System.out.println("wearing the belt when required...");
        }
        public void remove() {
            System.out.println("Remove belt when not required....");
        }


        public String toString() {
            return color + ", " + size + ", " + Arrays.toString(styles) + ", " + brand + ", " + type;
        }
    }
