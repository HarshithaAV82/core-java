package com.xworkz.tostringandequals.watermelon;

public class WatermelonRunner{
    public static void main(String[] args) {

        Watermelon watermelon = new Watermelon(5, "Hybrid", 120);
        Watermelon watermelon1 = new Watermelon(6, "Organic", 150);
        Watermelon watermelon2 = new Watermelon(5, "Hybrid", 120);

        boolean check = watermelon1.equals(watermelon2);

        System.out.println("check=" + check);
    }
}