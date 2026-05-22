package com.xworkz;

import com.xworkz.menu.FoodItem;
import com.xworkz.menu.OrderService;

public class CustomerOrder extends Customer
    implements OrderService{

    FoodItem food;

    CustomerOrder(String name, FoodItem food){
        super(name);
        this.food = food;
    }

    @Override
    public void placeOrder() {
        System.out.println(name + "Placed order");
    }
}

