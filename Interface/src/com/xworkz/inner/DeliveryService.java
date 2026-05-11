package com.xworkz.inner;

public interface DeliveryService {

    String COMPANY_NAME = "Swiggy";
    int DELIVERY_BOYS = 500;
    double DELIVERY_CHARGE = 45.5;

    void placeDelivery();
    void cancelDelivery();

    default void trackOrder() {
        System.out.println("running trackOrder in DeliveryService");
    }

    default void paymentOption() {
        System.out.println("running paymentOption in DeliveryService");
    }

    static void serviceInfo() {
        System.out.println("running serviceInfo in DeliveryService");
    }
}