package com.xworkz.practice;

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array to store:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("add the array element in the array:");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in the array is:" + smallest);
    }
}
