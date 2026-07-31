package com.xworkz.javaprograms;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("After removing duplicates:");

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < n - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            System.out.println(numbers[i] + " ");
        scanner.close();
    }
}
}