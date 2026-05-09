package com.xworkz.pratice;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = {5,2,3,9,1,2};

        for (int i =0; i < num.length; i++){
            for (int j=0; j<num.length-1; j++){
                if (num[j] > num[j + 1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");

        for(int number : num){
            System.out.println(number);
        }
    }
}
