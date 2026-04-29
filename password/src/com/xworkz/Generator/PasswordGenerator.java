package com.xworkz.Generator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password length:");
        int length = scanner.nextInt();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        String password = "";

        for (int i =0; i < length; i++){
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);

        }

        System.out.println("Generated password:" + password);
        scanner.close();
    }
}
