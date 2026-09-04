package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }

        Set<Integer> result = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println("Original List:" + numbers);
        System.out.println("Set:" + result);

        scanner.close();
    }
}
