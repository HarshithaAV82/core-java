package com.xworkz.tostringandequals.oil;

public class OilRunner{
    public static void main(String[] args) {

        Oil oil = new Oil("Sunflower", "Cooking", 150);
        Oil oil1 = new Oil("Petrol", "Fuel", 100);
        Oil oil2 = new Oil("Sunflower", "Cooking", 150);
        boolean check = oil1.equals(oil2);
        System.out.println("check=" + check);
    }
}
