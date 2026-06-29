package com.xworkz.practice;

import java.util.Scanner;

public class UniqueDuplicateFinder {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Duplicate Elemnets:");

        for (int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]){
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted){
                continue;
            }

            for (int j = i + 1; j < n; j++){

                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}