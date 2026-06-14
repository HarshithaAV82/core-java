package com.xworkz.collectionPractice;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101, "Harshitha");
        map.put(102, "Manasa");

        map.forEach((k,v) -> System.out.println("key:" + k + ", value: " + v));

    }
}
