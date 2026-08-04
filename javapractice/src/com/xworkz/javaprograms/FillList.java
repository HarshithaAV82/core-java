package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FillList {

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

        // Step 5: Print before fill
        System.out.println("Before Fill: " + list);

        // Step 6: Read fill value
        System.out.println("Enter the value to fill:");
        String value = scanner.nextLine();

        // Step 7: Fill the list
        Collections.fill(list, value);

        // Step 8: Print after fill
        System.out.println("After Fill: " + list);

        scanner.close();
    }
}