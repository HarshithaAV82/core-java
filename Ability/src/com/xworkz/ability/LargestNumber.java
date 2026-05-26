package com.xworkz.ability;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {667,777,2293,555,7428,334};
        System.out.println(Arrays.toString(arr));
        int largest = arr[0];
        for (int i=1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];

                }
            }
        System.out.println(largest);
        }

    }

