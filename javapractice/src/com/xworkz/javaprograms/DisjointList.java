package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DisjointList {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create two Lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Step 3: Read size of first list
        System.out.println("Enter size of first list:");
        int size1 = scanner.nextInt();

        // Step 4: Read first list elements
        System.out.println("Enter first list elements:");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        // Step 5: Read size of second list
        System.out.println("Enter size of second list:");
        int size2 = scanner.nextInt();

        // Step 6: Read second list elements
        System.out.println("Enter second list elements:");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        // Step 7: Print both lists
        System.out.println("First List  : " + list1);
        System.out.println("Second List : " + list2);

        // Step 8: Check whether both lists are disjoint
        boolean result = Collections.disjoint(list1, list2);

        // Step 9: Print the result
        if (result) {
            System.out.println("Both Lists are Disjoint");
        } else {
            System.out.println("Both Lists are Not Disjoint");
        }
        scanner.close();
    }
}