package com.xworkz.programs.outer;

import com.xworkz.programs.inner.SuperMarket;

public class Supplier {

    SuperMarket superMarket;

    public Supplier(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void supply() {

        System.out.println("Supplier supplying products");

        if(superMarket != null) {
            superMarket.purchase();
            superMarket.discount();
        }
    }
}