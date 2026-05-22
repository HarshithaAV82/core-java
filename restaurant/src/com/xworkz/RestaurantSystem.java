package com.xworkz;

import com.xworkz.menu.FoodItem;
import com.xworkz.restaurant.VegRestaurant;

import java.util.ArrayList;

public class RestaurantSystem {

    public static void main(String[] args) {

        ArrayList<FoodItem> list = new ArrayList<>();

        FoodItem food = new FoodItem(1, "Burger", 120);

        list.add(food);

        VegRestaurant vegRestaurant = new VegRestaurant();

        vegRestaurant.restaurantType();

        CustomerOrder customerOrder = new CustomerOrder("Harshitha", food);

        customerOrder.placeOrder();

        food.displayItem();

        System.out.println("Total Orders:" + FoodItem.totalOrders);

        Delivery delivery = new Delivery();
        delivery.start();
    }
}
