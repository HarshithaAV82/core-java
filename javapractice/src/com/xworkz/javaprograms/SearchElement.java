package com.xworkz.javaprograms;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        //Step 2 : Read size
        System.out.println("Enter size:");
        int n = scanner.nextInt();

        //Step 3 : Create array
        int[] numbers = new int[n];

        //Step 4 : Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        //Step 5 : Read search element
        System.out.println("Enter elements to search:");
        int search = scanner.nextInt();

        //Step 6 : Create boolean flag
        boolean found = false;

        //Step 7 : Traverse the array and compare
        for (int i = 0; i < n; i++){
            if (numbers[i] == search){
                found = true;
                break;
            }
        }
        //Step 8 : Print the result
        if (found){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
        scanner.close();
    }
}
