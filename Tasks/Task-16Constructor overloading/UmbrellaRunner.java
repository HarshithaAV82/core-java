class UmbrellaRunner{

    public static void main(String[] args) {

        Umbrella umbrella = new Umbrella("Puma", "Black", 999.0, 35.5, true);

        System.out.println("Brand: " + umbrella.brand);
        System.out.println("Color: " + umbrella.color);
        System.out.println("Price: " + umbrella.price);
        System.out.println("Length: " + umbrella.length);
        System.out.println("Is Automatic: " + umbrella.isAutomatic);

        Umbrella umbrella1 = new Umbrella("Skybags");
        System.out.println("Brand: " + umbrella1.brand);

        Umbrella umbrella2 = new Umbrella("Red", 499.0);
        System.out.println("Color: " + umbrella2.color);
        System.out.println("Price: " + umbrella2.price);

        Umbrella umbrella3 = new Umbrella("Blue", 799.0, 40.0);
        System.out.println("Color: " + umbrella3.color);
        System.out.println("Price: " + umbrella3.price);
        System.out.println("Length: " + umbrella3.length);

        Umbrella umbrella4 = new Umbrella(38.0, false);
        System.out.println("Length: " + umbrella4.length);
        System.out.println("Is Automatic: " + umbrella4.isAutomatic);

        Umbrella umbrella5 = new Umbrella("Green", 650.0, 36.0, true);
        System.out.println("Color: " + umbrella5.color);
        System.out.println("Price: " + umbrella5.price);
        System.out.println("Length: " + umbrella5.length);
        System.out.println("Is Automatic: " + umbrella5.isAutomatic);

        Umbrella umbrella6 = new Umbrella();
        System.out.println("Brand: " + umbrella6.brand);
        System.out.println("Color: " + umbrella6.color);
        System.out.println("Price: " + umbrella6.price);
        System.out.println("Length: " + umbrella6.length);
        System.out.println("Is Automatic: " + umbrella6.isAutomatic);
    }
}

