package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceAllExample {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create List
        List<String> list = new ArrayList<>();

        // Step 3: Read number of elements
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Step 4: Read elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        // Step 5: Print before replace
        System.out.println("Before Replace: " + list);

        // Step 6: Read replacement value
        System.out.println("Enter replacement value:");
        String value = scanner.nextLine();

        // Step 7: Replace all elements
        list.replaceAll(element -> value);

        // Step 8: Print after replace
        System.out.println("After Replace: " + list);

        scanner.close();
    }
}