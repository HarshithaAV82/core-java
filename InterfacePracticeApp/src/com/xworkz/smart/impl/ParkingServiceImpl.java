package com.xworkz.smart.impl;

import com.xworkz.smart.inner.ParkingService;

public class ParkingServiceImpl implements ParkingService {
    @Override
    public void allocateSlot() {
        System.out.println("Parking slot allocated");
    }

    @Override
    public void releaseSlot() {
        System.out.println("Parking slot released");
    }

    @Override
    public void calculateFee() {
        System.out.println("Parking fee calculated");
    }
}
