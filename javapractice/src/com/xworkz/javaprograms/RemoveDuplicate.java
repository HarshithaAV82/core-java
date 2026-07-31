package com.xworkz.javaprograms;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("After removing duplicates:");

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            // Check only previous elements
            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}