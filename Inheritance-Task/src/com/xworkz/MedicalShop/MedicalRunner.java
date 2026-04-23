package com.xworkz.MedicalShop;

public class MedicalRunner{
        public static void main(String[] args) {
            Owner owner = new Owner("Manu", "Bangalore");
            String[] medicines = {"Paracetamol", "Dolo", "knufCold"};
            MedicalShop shop = new MedicalShop("HealthCare", 100, medicines, owner, MedicalType.SMALL);
            shop.open();
            shop.close();
            System.out.println(shop);
            Tablet tablet = new Tablet("City Medical", 200, medicines, owner, MedicalType.BIG, true, 5);
            tablet.open();
            tablet.close();
            System.out.println(tablet);
        }
    }

