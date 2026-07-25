package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {

        // Step 1: Create List
        List<String> names = new ArrayList<>();

        // Step 2: Add elements
        names.add("Harshitha");
        names.add("Anusha");
        names.add("Bhavana");
        names.add("Kavya");

        // Step 3: Print before reverse
        System.out.println("Before Reverse : " + names);

        // Step 4: Reverse the list
        Collections.reverse(names);

        // Step 5: Print after reverse
        System.out.println("After Reverse : " + names);
    }
}