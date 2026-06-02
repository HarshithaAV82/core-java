package com.xworkz.ability;

import java.util.Scanner;

public class SalaryCalculation {

    static Scanner scanner = new Scanner(System.in);

    public static int SALARY;
    public static int BONUS;

    public static void basicSalary(){

        System.out.println("Enter Salary:");
        SALARY = scanner.nextInt();
    }

    public static void totalSalary(){

        System.out.println("Enter Bonus:");
        BONUS = scanner.nextInt();

        int total = BONUS + SALARY;
        System.out.println("The total amount is: " + total);
    }

    public static void main(String[] args) {

        basicSalary();
        totalSalary();

        System.out.println("SALARY: " + SALARY);
        System.out.println("BONUS: " + BONUS);
    }
}