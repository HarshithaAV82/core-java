package com.xworkz.smart.inner;

public interface ParkingService {

    String AREA_NAME = "City Parking";
    int TOTAL_SLOTS = 200;

    void allocateSlot();
    void releaseSlot();
    void calculateFee();
}