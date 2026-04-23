package com.xworkz.helmet;

public class HelmetRunner{
        public static void main(String[] args){

            HelmetBrand brand = new HelmetBrand("Royal Enfield", "India");
            String[] colors = {"Black", "Red", "Blue"};

            Helmet helmet = new Helmet(true, 1500.0, colors, brand, HelmetType.FULL_FACE);
            helmet.wearHelmet();
            helmet.removeHelmet();
            System.out.println(helmet);

            SafetyHelmet safetyHelmet = new SafetyHelmet(true, 3000.0, colors, brand, HelmetType.HALF_FACE, 5, true);
            safetyHelmet.wearHelmet();
            safetyHelmet.removeHelmet();
            System.out.println(safetyHelmet);
        }
    }
