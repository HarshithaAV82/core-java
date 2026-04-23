package com.xworkz.Chain;
    public class ChainDetails extends Chain{
        boolean heavy;
        int price;

        public ChainDetails(String design, int length, String[] styles, ChainBrand brand, ChainType type, boolean heavy, int price) {
            super(design, length, styles, brand, type);
            this.heavy = heavy;
            this.price = price;
        }

        public void wear() {
            System.out.println("The method of wear is override from the parent...");
        }
        public void remove() {
            System.out.println("the method of remove is override from the parent....");
        }

        public String toString() {
            return super.toString() + ", " + heavy + ", " + price;
        }
    }
