package com.xworkz.simple;

public class HospitalRunner {

    public static void main(String[] args) {
        MultiSpecialityHospital multiSpecialityHospital = new MultiSpecialityHospital();
        multiSpecialityHospital.display();
        multiSpecialityHospital.treatment();
        multiSpecialityHospital.emergencyService();

        int beds = 200;
        int occupiedBeds = 150;

        System.out.println("Avaliable Beds:" + (beds - occupiedBeds));

        if (beds > occupiedBeds){
            System.out.println("Beds available");
        }else {
            System.out.println("No beds");
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("Patient number :" + i);
        }
        String deparments[] = {"cardiology", "Neurology" , "Orthopedic"};

        System.out.println("Departments");

        for (String dept: deparments){
            System.out.println(dept);
        }
    }
}
