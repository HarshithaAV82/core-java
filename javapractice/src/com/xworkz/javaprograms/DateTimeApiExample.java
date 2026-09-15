package com.xworkz.javaprograms;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApiExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("1. LocalDate:");
        System.out.println("Current Date:" + today);

        LocalTime currentTime = LocalTime.now();

        System.out.println("\n2. Location:");
        System.out.println("Current Time:" + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("\n3. LocalDateTime:");
        System.out.println("Current Date and Time:" + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("\n 4. DateTimeFormatter:");
        System.out.println("Formatted Date:" + formattedDate);

        LocalDate birthDate = LocalDate.of(2003, 5, 15);

        Period period = Period.between(birthDate, today);

        System.out.println("\n5. Period:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(13, 45);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("\n6. Duration:");
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());

        LocalDate date = LocalDate.of(2026, 9, 15);

        LocalDate afterDays = date.plusDays(10);
        LocalDate afterMonths = date.plusMonths(2);
        LocalDate afterYears = date.plusYears(1);

        LocalDate beforeDays = date.minusDays(5);
        LocalDate beforeMonths = date.minusMonths(1);
        LocalDate beforeYears = date.minusYears(1);

        System.out.println("\n7. Adding and Subtracting:");
        System.out.println("Original Date: " + date);
        System.out.println("After 10 Days: " + afterDays);
        System.out.println("After 2 Months: " + afterMonths);
        System.out.println("After 1 Year: " + afterYears);
        System.out.println("Before 5 Days: " + beforeDays);
        System.out.println("Before 1 Month: " + beforeMonths);
        System.out.println("Before 1 Year: " + beforeYears);

        LocalDate date1 = LocalDate.of(2026, 9, 15);
        LocalDate date2 = LocalDate.of(2026, 10, 15);

        System.out.println("\n8. Comparing Dates:");

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        }

        if (date2.isAfter(date1)) {
            System.out.println(date2 + " is after " + date1);
        }

        if (date1.isEqual(date2)) {
            System.out.println("Both dates are equal");
        }

        String dateString = "15-09-2026";

        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parsedDate =
                LocalDate.parse(dateString, inputFormatter);

        System.out.println("\n9. Parsing Date String:");
        System.out.println("String Date: " + dateString);
        System.out.println("Parsed LocalDate: " + parsedDate);

    }
}
