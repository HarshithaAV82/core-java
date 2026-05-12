package com.xworkz.programs.impl;

import com.xworkz.programs.inner.MenuCard;

public class RestaurantMenu implements MenuCard {

    public String[] getItems(int tableNo, String customerName) {

        System.out.println("Table Number : " + tableNo);
        System.out.println("Customer Name : " + customerName);

        return new String[]{"Dosa", "Idli", "Meals"};
    }
}