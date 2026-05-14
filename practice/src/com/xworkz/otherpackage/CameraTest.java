package com.xworkz.otherpackage;
import com.xworkz.accessspecifier.Camera;

public class CameraTest {

    public static void main(String[] args) {

        Camera camera = new Camera();

        System.out.println(camera.brand);
        camera.capture();

    }
}