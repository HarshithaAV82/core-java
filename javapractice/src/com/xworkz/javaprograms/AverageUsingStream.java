package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageUsingStream {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0 ; i < n; i++){
            num.add(scanner.nextInt());
        }

        double average = num.stream()
                .mapToInt(number -> number)
                .average()
                .orElse(0);

        System.out.println("Average:" + average);

        scanner.close();
    }
}
