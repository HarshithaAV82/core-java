package com.xworkz.helmet;

public class SafetyHelmet extends Helmet{
        int safetyRating;
        boolean shockAbsorbing;
        public SafetyHelmet(boolean isCompulsory, double price, String[] colors, HelmetBrand brand, HelmetType type, int safetyRating, boolean shockAbsorbing) {
            super(isCompulsory, price, colors, brand, type);
            this.safetyRating = safetyRating;
            this.shockAbsorbing = shockAbsorbing;
        }

        @Override
        public void wearHelmet() {

            System.out.println("Overridden wearHelmet in SafetyHelmet");
        }

        @Override
        public void removeHelmet() {

            System.out.println("Overridden removeHelmet in SafetyHelmet");
        }

        @Override
        public String toString() {
            return super.toString() + ", Safety Rating: " + safetyRating + ", Shock Absorbing: " + shockAbsorbing;
        }
    }

