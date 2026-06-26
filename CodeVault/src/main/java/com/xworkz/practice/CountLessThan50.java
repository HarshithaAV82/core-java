package com.xworkz.practice;

import java.util.Scanner;

public class CountLessThan50 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++){

            if(arr[i] < 50){

                count++;
            }
        }

        System.out.println("Number of elements smaller than 50:" + count);
    }
}
