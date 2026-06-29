package com.xworkz.practice;

import java.util.Scanner;

public class FindDuplicateElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Eneter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < n; i++){

            for (int j = i + 1; j < n; j++){

                if (arr[i] == arr[j]){

                    System.out.println(arr[i]);

                    break;
                }
            }
        }

    }

}
