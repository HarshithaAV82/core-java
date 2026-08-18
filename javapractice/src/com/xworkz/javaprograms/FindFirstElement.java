package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFirstElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create List
        List<Integer> numbers = new ArrayList<>();

        // Step 2: Read number of elements
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        // Step 3: Read elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Step 4: Find first element
        numbers.stream()
                .findFirst()
                .ifPresent(number -> System.out.println("First Element: " + number));

        scanner.close();
    }
}