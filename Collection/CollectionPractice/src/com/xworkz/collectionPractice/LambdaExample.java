package com.xworkz.collectionPractice;

import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("Sql");

        list.forEach(name -> System.out.println(name));
    }
}
