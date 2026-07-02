package com.xworkz.practice;

import java.util.Scanner;

public class CommonElementsBetweenTwoArrays {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of first array");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];


        System.out.println("Enter the first array elements");

           for (int i = 0; i < n1; i++){
               arr1[i] = scanner.nextInt();
           }

        System.out.println("Enter the size of second array");
        int n2 = scanner.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter the second array elements");

        for (int i = 0; i < n2; i++){
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Common Elements");

        for (int i = 0; i < n1; i++){

            for (int j = 0; j < n2; j++){

                if(arr1[i] == arr2[j]){

                    System.out.println(arr1[i]);
                    break;
                }
            }

        }
    }
}
