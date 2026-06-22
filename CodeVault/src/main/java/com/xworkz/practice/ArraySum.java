package com.xworkz.practice;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Find Sum of Array Elements
        int n = scanner.nextInt();  //Take the size of the array

        int[] arr = new int[n];     //Create the array

        for (int i = 0; i < n; i++){         //Store user inputs
            arr[i] = scanner.nextInt();

            int sum = 0;          //Create a variable to store the sum

           for (int i = 0; i < n; i++){   //Add all array elements
            sum = sum + arr[i];
           }
            System.out.println(sum); //Print the answer
        }
    }

}



