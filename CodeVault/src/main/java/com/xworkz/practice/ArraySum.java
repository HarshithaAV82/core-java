package com.xworkz.practice;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Find Sum of Array Elements
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();  //Take the size of the array

        int[] arr = new int[n];     //Create the array

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {         //Store user inputs
            arr[i] = scanner.nextInt();
        }
            int sum = 0;          //Create a variable to store the sum

           for (int j = 0; j < n; j++){   //Add all array elements
            sum = sum + arr[j];
           }

            System.out.println("Sum of array elements is: " + sum);
        }
    }





