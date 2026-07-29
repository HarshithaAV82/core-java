package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create List
        List<Integer> numbers = new ArrayList<>();

        // Step 3: Read the number of elements
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        // Step 4: Read the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++){
            numbers.add(scanner.nextInt());
        }

        // Step 5: Print the List
        System.out.println("List:" + numbers);

        // Step 6: Find the minimum element
        int min = Collections.min(numbers);

        // Step 7: Print the minimum element
        System.out.println("Minimum Element:" + min);
    }
}
