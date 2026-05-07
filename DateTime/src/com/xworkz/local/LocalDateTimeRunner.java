package com.xworkz.local;

import java.time.LocalDateTime;

public class LocalDateTimeRunner{

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        LocalDateTime meeting = LocalDateTime.of(2026, 5, 20, 10, 30);

        System.out.println("Meeting Time: " + meeting);

        System.out.println("Hour: " + now.getHour());

        System.out.println("Minute: " + now.getMinute());

        System.out.println("After 2 Hours: " + now.plusHours(2));

        System.out.println("Before 1 Hour: " + now.minusHours(1));
    }
}
