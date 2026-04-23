package com.xworkz.MedicalShop;
    public class Tablet extends MedicalShop{
        boolean delivery;
        int staff;

        public Tablet(String shopName, int items, String[] medicines, Owner owner, MedicalType type, boolean delivery, int staff){
            super(shopName, items, medicines, owner, type);
            this.delivery = delivery;
            this.staff = staff;
        }

        @Override
        public void open(){
            System.out.println("the tablet is running....in open");
        }

        @Override
        public void close(){
            System.out.println("the close method is override from parent class...");
        }

        @Override
        public String toString() {
            return super.toString() + ", " + delivery + ", " + staff;
        }
    }


