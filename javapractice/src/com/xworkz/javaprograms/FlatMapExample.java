package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> numbers = new ArrayList<>();

        System.out.println("Enter number of lists:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter number of elements in list" + (i + 1) + ":");
            int size = scanner.nextInt();

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++){
                list.add(scanner.nextInt());
            }
            numbers.add(list);
        }

        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Original Lists:" + numbers);
        System.out.println("After flatMap:" + result);

        scanner.close();
    }
}
