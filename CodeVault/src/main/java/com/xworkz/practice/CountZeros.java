package com.xworkz.practice;

import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;

            for (int i = 0; i < n; i++){

                if(arr[i] == 0){
                    count++;
                }
            }
        System.out.println("Number of zero elements:" + count);
        }
    }
