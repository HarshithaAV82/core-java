package com.xworkz.practice;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i ++){

            if(arr[i] != 0){

                arr[index] = arr[i];

                index++;
            }
        }
        while (index < n){
            arr[index] = 0;
            index++;
        }
        System.out.println("Array after moving zeros to end:");

        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
