package com.xworkz.Plate;

public class PlateRunner {
        public static void main(String[] args) {
            PlateBrand brand = new PlateBrand("Prestige", "India");
            String[] uses = {"Food", "Snacks"};

            Plate plate = new Plate("Round", 10, uses, brand, PlateType.STEEL);
            System.out.println("this is the plate details,type,brand.....");
            plate.use();
            plate.wash();
            System.out.println(plate);

            PlateDetails details = new PlateDetails("Square", 12, uses, brand, PlateType.PLASTIC, true, 300);
            System.out.println("printining the plate details , plateType, plateBrand....");
            details.use();
            details.wash();
            System.out.println(details);
        }
    }
