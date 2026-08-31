package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }

        List<Integer> sortedNumbers = numbers.stream().sorted()
                .collect(Collectors.toList());

        System.out.println("Before sorting:" + numbers);
        System.out.println("After Sorting:" + sortedNumbers);

        scanner.close();
    }
}
