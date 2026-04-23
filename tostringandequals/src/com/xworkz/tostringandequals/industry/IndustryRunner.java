package com.xworkz.tostringandequals.industry;

public class IndustryRunner{
    public static void main(String[] args) {

        Industry industry = new Industry("Infosys", "IT", 100000);
        Industry industry1 = new Industry("Reliance", "Oil", 200000);
        Industry industry2= new Industry("Infosys", "IT", 100000);

        boolean check = industry2.equals(industry);
        System.out.println("check=" + check);
    }
}
