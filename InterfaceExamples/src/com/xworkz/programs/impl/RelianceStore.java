package com.xworkz.programs.impl;
import com.xworkz.programs.inner.SuperMarket;

public class RelianceStore implements SuperMarket {

    public void purchase() {
        System.out.println("Products purchased from Reliance Store");
    }

    public void discount() {
        System.out.println("Discount applied successfully");
    }
}