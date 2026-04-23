package com.xworkz.tostringandequals.toothpaste;

public class ToothpasteRunner{
    public static void main(String[] args) {

        Toothpaste toothpaste = new Toothpaste("Colgate", 95, "Mint");
        Toothpaste toothpaste1 = new Toothpaste("CloseUp", 120, "Herbal");
        Toothpaste toothpaste2 = new Toothpaste("Colgate", 95, "Mint");

        boolean check = toothpaste2.equals(toothpaste);
        System.out.println("check=" + check);
    }
}