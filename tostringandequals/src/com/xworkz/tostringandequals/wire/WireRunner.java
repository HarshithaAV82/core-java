package com.xworkz.tostringandequals.wire;

public class WireRunner{
    public static void main(String[] args){

        Wire wire1 = new Wire(10, "Copper", 1500);
        Wire wire2 = new Wire(20, "Aluminum", 2000);
        Wire wire3 = new Wire(10, "Copper", 1500);

        boolean check=wire1.equals(wire2);
        System.out.println("check="+check);
    }
}