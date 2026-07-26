package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {

    public static void main(String[] args) {

        // Step 1: Create List
        List<String> names = new ArrayList<>();

        // Step 2: Add elements
        names.add("Harshitha");
        names.add("Anusha");
        names.add("Bhavana");
        names.add("Kavya");

        // Step 3: Print before shuffle
        System.out.println("Before Shuffle : " + names);

        // Step 4: Shuffle the list
        Collections.shuffle(names);

        // Step 5: Print after shuffle
        System.out.println("After Shuffle : " + names);
    }
}


//  // Step 1: Create Scanner object
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Create List
//        List<String> names = new ArrayList<>();
//
//        // Step 3: Read the number of elements
//        System.out.println("Enter the number of names:");
//        int size = scanner.nextInt();
//        scanner.nextLine(); // Consume the leftover newline
//
//        // Step 4: Read the names
//        System.out.println("Enter the names:");
//        for (int i = 0; i < size; i++) {
//            names.add(scanner.nextLine());
//        }
//
//        // Step 5: Print before shuffle
//        System.out.println("Before Shuffle : " + names);
//
//        // Step 6: Shuffle the list
//        Collections.shuffle(names);
//
//        // Step 7: Print after shuffle
//        System.out.println("After Shuffle : " + names);