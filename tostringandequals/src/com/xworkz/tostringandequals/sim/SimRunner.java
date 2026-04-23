package com.xworkz.tostringandequals.sim;
public class SimRunner{
    public static void main(String[] args) {

        Sim sim= new Sim("Jio", "4G", 199);
        Sim sim1 = new Sim("Airtel", "5G", 299);
        Sim sim2 = new Sim("Jio", "4G", 199);

        boolean check = sim2.equals(sim1);

        System.out.println("check=" + check);
    }
}