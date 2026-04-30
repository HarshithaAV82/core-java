package com.xworkz.smart.runner;

import com.xworkz.smart.impl.DeliveryServiceImpl;
import com.xworkz.smart.inner.DeliveryService;

public class Main2 {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryServiceImpl();
        deliveryService.assignOrder();
        deliveryService.deliverOrder();
        deliveryService.trackOrder();

        System.out.println(DeliveryService.COMPANY_NAME);
        System.out.println(DeliveryService.MAX_ORDERS);
    }
}
