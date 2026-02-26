class CarromRunner{

    public static void main(String[] args) {

        Carrom carrom = new Carrom("Synco", "Wood", 4999.0, 29.0, false);
        System.out.println("Brand: " + carrom.brand);
        System.out.println("Material: " + carrom.material);
        System.out.println("Price: " + carrom.price);
        System.out.println("Size: " + carrom.size);
        System.out.println("Is Foldable: " + carrom.isFoldable);

        Carrom carrom1 = new Carrom("Precise");
        System.out.println("Brand: " + carrom1.brand);

        Carrom carrom2 = new Carrom("Plywood", 3500.0);
        System.out.println("Material: " + carrom2.material);
        System.out.println("Price: " + carrom2.price);

        Carrom carrom3 = new Carrom(30.0, true);
        System.out.println("Size: " + carrom3.size);
        System.out.println("Is Foldable: " + carrom3.isFoldable);

        Carrom carrom4 = new Carrom("Hardwood", 4200.0, 28.0);
        System.out.println("Material: " + carrom4.material);
        System.out.println("Price: " + carrom4.price);
        System.out.println("Size: " + carrom4.size);

        Carrom carrom5 = new Carrom();
        System.out.println("Brand: " + carrom5.brand);
        System.out.println("Material: " + carrom5.material);
        System.out.println("Price: " + carrom5.price);
        System.out.println("Size: " + carrom5.size);
        System.out.println("Is Foldable: " + carrom5.isFoldable);
    }
}