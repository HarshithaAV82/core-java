package com.xworkz.smart.impl;

import com.xworkz.smart.inner.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public void assignOrder() {
        System.out.println("Order assigned to delivery partner");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered successfully");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order location");
    }
}
