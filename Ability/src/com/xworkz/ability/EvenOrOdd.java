package com.xworkz.ability;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5, 7, 8, 6, 9};

        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}

