package com.xworkz.runner;

import com.xworkz.inner.DeliveryService;
import com.xworkz.outer.Zomato;

public class DeliveryRunner {

    public static void main(String[] args) {

        DeliveryService deliveryService = new Zomato();

        deliveryService.placeDelivery();
        deliveryService.cancelDelivery();
        deliveryService.trackOrder();
        deliveryService.paymentOption();

        DeliveryService.serviceInfo();
    }
}