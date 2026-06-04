package com.xworkz.ability;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {12, 5, 8, 2, 15};
        int largest = arr[0];

        for(int i =1; i < arr.length; i++){

            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest Number:" + largest);
    }
}
