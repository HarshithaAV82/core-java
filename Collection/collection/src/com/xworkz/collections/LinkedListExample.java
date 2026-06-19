package com.xworkz.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Spring");
        list.add("SQL");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
