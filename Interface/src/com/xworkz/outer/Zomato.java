package com.xworkz.outer;

import com.xworkz.inner.DeliveryService;

public class Zomato implements DeliveryService {

    public void placeDelivery() {
        System.out.println("implemented placeDelivery in Zomato");
    }

    public void cancelDelivery() {
        System.out.println("implemented cancelDelivery in Zomato");
    }
}