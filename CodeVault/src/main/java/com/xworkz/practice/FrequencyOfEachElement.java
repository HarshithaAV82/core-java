package com.xworkz.practice;

import java.util.Scanner;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter tha array elemnets");

        for(int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Frequency of each element");
        for (int i = 0; i < n; i++){

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++){

                if (arr[i] == arr[k]){
                    alreadyCounted = true;
                     break;
                }
            }

            if (alreadyCounted){
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < n; j++){

                if (arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i]  + " -> " + count);
        }
    }
}
