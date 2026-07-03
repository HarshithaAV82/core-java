package com.xworkz.practice;

import java.util.Scanner;

public class RemoveElementFromArray {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to remove");
        int removeElement = scanner.nextInt();

        System.out.println("Array after removing element:");

        for (int i = 0; i < n; i++){

            if(arr[i] != removeElement){

                System.out.println(arr[i] + " ");
            }
        }

    }
}
