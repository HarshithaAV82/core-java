package com.xworkz.accessspecifier;

public class CameraRunner {

    public static void main(String[] args) {

        Camera camera = new Camera();

        System.out.println(camera.brand);
        camera.capture();

        System.out.println(camera.lensType);
        camera.lens();

        System.out.println(camera.color);
        camera.displayColor();
    }
}