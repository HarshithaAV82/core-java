package com.xworkz.collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Sql");


        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
