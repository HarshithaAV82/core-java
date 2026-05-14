package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Phone;;

public class CustomerRunner {

    public static void main(String[] args) {

        Phone phone = new Phone();

        System.out.println(phone.brand);
        phone.call();

    }
}