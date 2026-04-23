package com.xworkz.Chain;
import java.util.Arrays;

    public class Chain{
        String design;
        int length;
        String[] styles;
        ChainBrand brand;
        ChainType type;

        public Chain(String design, int length, String[] styles, ChainBrand brand, ChainType type) {
            this.design = design;
            this.length = length;
            this.styles = styles;
            this.brand = brand;
            this.type = type;
        }

        public void wear(){
            System.out.println("Wearing the Gold chain is too Costly");
        }
        public void remove(){
            System.out.println("Remove Gold Chain...");
        }

        public String toString(){
            return design + ", " + length + ", " + Arrays.toString(styles) + ", " + brand + ", " + type;
        }
    }
