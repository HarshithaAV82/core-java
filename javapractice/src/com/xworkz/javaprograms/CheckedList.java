package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckedList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create List
        List<String> list = new ArrayList<>();

        // Step 2: Read number of elements
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Step 3: Read elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        // Step 4: Create checked list
        List<String> checkedList =
                Collections.checkedList(list, String.class);

        // Step 5: Print the list
        System.out.println("Checked List: " + checkedList);

        // Step 6: Add another String
        System.out.println("Enter another element:");
        String value = scanner.nextLine();

        checkedList.add(value);

        // Step 7: Print updated list
        System.out.println("After Adding: " + checkedList);

        scanner.close();
    }
}