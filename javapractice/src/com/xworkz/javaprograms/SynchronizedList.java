package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SynchronizedList {

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

        // Step 4: Create synchronized list
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Step 5: Print the list
        System.out.println("Synchronized List:" + synchronizedList);

        scanner.close();
    }
}
