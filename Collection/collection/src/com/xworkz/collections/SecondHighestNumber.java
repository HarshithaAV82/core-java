package com.xworkz.collections;

import java.util.ArrayList;

public class SecondHighestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(80);
        list.add(20);

        int highest = list.get(0);
        int secondHighest = list.get(0);

        for (int i = 1; i < list.size(); i++){

            if(list.get(i) > highest) {
                secondHighest = highest;
                highest = list.get(i);
            }
                else if(list.get(i) > secondHighest){

                    secondHighest = list.get(i);
                }
            }

            System.out.println("Highest Number:" + highest);
            System.out.println("Second Highest number:" + secondHighest);
        }

}

