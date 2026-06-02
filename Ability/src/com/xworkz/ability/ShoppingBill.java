package com.xworkz.ability;

import java.util.Scanner;

public class ShoppingBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product price:");
        int price = scanner.nextInt();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        int totalBill = price * quantity;

        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + totalBill);
    }
}