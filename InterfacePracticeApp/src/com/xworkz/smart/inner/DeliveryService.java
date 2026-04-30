package com.xworkz.smart.inner;

public interface DeliveryService {

    String COMPANY_NAME = "Food Delivery";
    int MAX_ORDERS = 50;

    void assignOrder();
    void deliverOrder();
    void trackOrder();
}
