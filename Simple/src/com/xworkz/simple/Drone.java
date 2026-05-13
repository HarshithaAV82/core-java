package com.xworkz.simple;

class Drone {

    String company = "SkyTech";
    double height = 120.5;
    boolean cameraAvailable = true;

    void display() {
        System.out.println("Company : " + company);
        System.out.println("Flying Height : " + height);
        System.out.println("Camera Available : " + cameraAvailable);
    }

    void captureVideo() {
        System.out.println("Drone is capturing video");
    }

    void returnHome() {
        System.out.println("Drone returned to home location");
    }

    public static void main(String[] args) {

        Drone drone = new Drone();

        drone.display();
        drone.captureVideo();
        drone.returnHome();
    }
}