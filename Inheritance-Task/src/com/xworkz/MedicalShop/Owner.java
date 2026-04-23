package com.xworkz.MedicalShop;

public class Owner{
        String name;
        String city;

        public Owner(String name, String city){
            this.name = name;
            this.city = city;
        }

        public String toString(){
            return name + ", " + city;
        }
    }
