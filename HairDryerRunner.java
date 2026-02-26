class HairDryerRunner{

    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer("Philips", "Black", 1999.0, 1800, true);
        System.out.println("Brand: " + hairDryer.brand);
        System.out.println("Color: " + hairDryer.color);
        System.out.println("Price: " + hairDryer.price);
        System.out.println("Power: " + hairDryer.power);
        System.out.println("Is Portable: " + hairDryer.isPortable);

        HairDryer hairDryer1 = new HairDryer("Panasonic");
        System.out.println("Brand: " + hairDryer1.brand);

        HairDryer hairDryer2 = new HairDryer("White", 1499.0);
        System.out.println("Color: " + hairDryer2.color);
        System.out.println("Price: " + hairDryer2.price);

        HairDryer hairDryer3 = new HairDryer(2000, false);
        System.out.println("Power: " + hairDryer3.power);
        System.out.println("Is Portable: " + hairDryer3.isPortable);

        HairDryer hairDryer4 = new HairDryer("Blue", 1799.0, 1600);
        System.out.println("Color: " + hairDryer4.color);
        System.out.println("Price: " + hairDryer4.price);
        System.out.println("Power: " + hairDryer4.power);

        HairDryer hairDryer5 = new HairDryer();
        System.out.println("Brand: " + hairDryer5.brand);
        System.out.println("Color: " + hairDryer5.color);
        System.out.println("Price: " + hairDryer5.price);
        System.out.println("Power: " + hairDryer5.power);
        System.out.println("Is Portable: " + hairDryer5.isPortable);
    }
}