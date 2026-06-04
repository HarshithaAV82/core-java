package com.xworkz.ability;

import java.util.Scanner;

public class SecondLargest {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {10,20,30,40};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second Largest Number:" + secondLargest);
    }
}
