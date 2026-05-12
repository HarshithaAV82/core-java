package com.xworkz.programs.outer;

import com.xworkz.programs.inner.Hospital;

public class Surgeon {

    Hospital hospital;

    public Surgeon(Hospital hospital) {
        this.hospital = hospital;
    }

    public void treatPatient() {

        System.out.println("Doctor checking patient");

        if(hospital != null) {
            hospital.treatment();
        }
    }
}