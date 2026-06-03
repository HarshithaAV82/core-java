package com.xworkz.ability;

import java.util.Scanner;

public class ElectricityBill {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter units:");
        int units = scanner.nextInt();

        int bill;

        if(units <= 100){
            bill = units * 2;
        }
        else{

            bill = (100 * 2) + ((units - 100) * 5);
        }
        System.out.println("Electricity Bill: " + bill);
    }
}
