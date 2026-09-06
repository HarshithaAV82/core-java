package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartitioningByCounting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of element:");
        int n = scanner.nextInt();

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        Map<Boolean, Long> res = num.stream()
                .collect(Collectors.partitioningBy(
                        number -> number % 2 == 0,
                        Collectors.counting()
                ));

        System.out.println("Even Count:" + res.get(true));
        System.out.println("Odd Count:" + res.get(false));

        scanner.close();
    }
}
