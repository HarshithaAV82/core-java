package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Phone;

public class VivoPhone extends Phone {

    public static void main(String[] args) {

        VivoPhone vivo = new VivoPhone();

        System.out.println(vivo.brand);
        vivo.call();

        System.out.println(vivo.processor);
        vivo.performance();

    }
}