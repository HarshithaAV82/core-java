package com.xworkz.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101,"Hema");
        map.put(102,"manu");

        System.out.println(map);
    }
}// maintains insertion order.
