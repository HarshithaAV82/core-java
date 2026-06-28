package com.xworkz.practice;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");

        for(int i = 0; i < n; i++){

            arr[i] = scanner.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < n;  i++){

            if(arr[i] > largest){

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest){


                    secondLargest = arr[i];

                }
            }
            System.out.println("Second Largest Element:" + secondLargest);
        }
    }

