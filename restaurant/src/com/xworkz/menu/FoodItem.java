package com.xworkz.menu;

public class FoodItem {

    private int itemId;
    private String itemName;
    private double price;

    public static int totalOrders = 0;

    public FoodItem(int itemId, String itemName, double price){

        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        totalOrders++;
    }

    public  void displayItem(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Food Name:" + itemName);
        System.out.println("Price:" + price);
    }
}

