package com.xworkz.Belt;

public class BeltRunner{
        public static void main(String[] args) {
            BeltBrand brand = new BeltBrand("Puma", "India");
            String[] styles = {"Casual", "Formal"};
            Belt belt = new Belt("Black", 32, styles, brand,BeltType.LEATHER);
            belt.wear();
            belt.remove();
            System.out.println(belt);

            BeltDetails details = new BeltDetails("Brown", 34, styles, brand, BeltType.CLOTH, true, 800);
            details.wear();
            details.remove();
            System.out.println(details);
        }
    }

