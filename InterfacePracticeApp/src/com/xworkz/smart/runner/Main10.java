package com.xworkz.smart.runner;

import com.xworkz.smart.impl.ParkingServiceImpl;
import com.xworkz.smart.inner.ParkingService;

public class Main10 {

    public static void main(String[] args) {

        ParkingService parking = new ParkingServiceImpl();


        parking.allocateSlot();
        parking.releaseSlot();
        parking.calculateFee();

        System.out.println(ParkingService.AREA_NAME);
        System.out.println(ParkingService.TOTAL_SLOTS);
    }
}
