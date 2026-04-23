package com.xworkz.tostringandequals.diamond;
public class DiamondRunner{
    public static void main(String[] args){

        Diamond diamond = new Diamond(1.5, "Premium", 250000);
        Diamond diamond1 = new Diamond(2.0, "Normal", 300000);
        Diamond diamond2 = new Diamond(1.5, "Premium", 250000);

        boolean check = diamond1.equals(diamond2);
        System.out.println("check=" + check);
    }
}