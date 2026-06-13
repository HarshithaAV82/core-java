package com.xworkz.collectionPractice;

import java.util.ArrayList;

public class ArrayListLoop {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("java");
        names.add("Spring");
        names.add("Hibernate");


        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
