package com.xworkz.javaprograms;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read size
        System.out.println("Enter size:");
        int n = scanner.nextInt();

        // Step 3: Create array
        int[] numbers = new int[n];

        // Step 4: Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 5: Print reverse array
        System.out.println("Reversed Array:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}