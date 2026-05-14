package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Camera;

public class SonyCamera extends Camera {

    public static void main(String[] args) {

        SonyCamera sony = new SonyCamera();

        System.out.println(sony.brand);
        sony.capture();

        System.out.println(sony.lensType);
        sony.lens();

    }
}