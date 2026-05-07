package com.xworkz.local;

import java.time.LocalDate;

public class LocalDateRunner {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today Date:" + localDate);

        LocalDate birthday = LocalDate.of(2004,3,3);
        System.out.println("Birthday:" + birthday);

        System.out.println("Year:" + localDate.getYear());
        System.out.println("Month:" + localDate.getMonth());
        System.out.println("Day:" + localDate.getDayOfMonth());
        System.out.println("Next Week:" + localDate.plusDays(7));
        System.out.println("Previous Week:" + localDate.minusDays(7));
        System.out.println("Leap year:" + localDate.isLeapYear());
    }
}
