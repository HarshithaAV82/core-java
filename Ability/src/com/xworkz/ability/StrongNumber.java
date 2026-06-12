package com.xworkz.ability;

public class StrongNumber {

    public static void main(String[] args) {

        int num = 145;
        int original = num;
        int sum = 0;

        while(num != 0){

            int digit = num % 10;

            int factorial = 1;

            for(int i = 1; i <= digit; i++){
                factorial = factorial * i;
            }

            sum = sum + factorial;

            num = num / 10;
        }
        if (sum == original){
            System.out.println(original + " " + "is a Strong Number");
        }
        else {
            System.out.println(original + " " + "is Not a Strong Number");
        }
    }
}
