package com.xworkz.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MobilePhoneRunner {

    public static void main(String[] args) {

        ArrayList<MobilePhone> list = new ArrayList<>();

        list.add(new MobilePhone(101, "Samsung", 30000));
        list.add(new MobilePhone(102, "vivo", 20000));
        list.add(new MobilePhone(103, "apple", 8000));

        Collections.sort(list);

        System.out.println(list);
    }
}
