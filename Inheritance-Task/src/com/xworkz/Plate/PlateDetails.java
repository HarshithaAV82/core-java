package com.xworkz.Plate;
    public class PlateDetails extends Plate {
        boolean strong;
        int price;

        public PlateDetails(String shape, int size, String[] uses, PlateBrand brand, PlateType type, boolean strong, int price) {
            super(shape, size, uses, brand, type);
            this.strong = strong;
            this.price = price;
        }

        public void use() {
            System.out.println("the use method override plate details is used in parent...");
        }
        public void wash() {
            System.out.println("the wash method override plate details is used in parent ");
        }

        public String toString() {
            return super.toString() + ", " + strong + ", " + price;
        }
    }

