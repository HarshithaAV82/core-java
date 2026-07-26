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