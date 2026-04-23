class MushroomRunner{

    public static void main(String[] args) {

        Farmer farmer1 = new Farmer("Ramesh");
        Farmer farmer2 = new Farmer("Suresh");

        Mushroom m1 = new Mushroom(10, farmer1, MushroomType.BUTTON);
        Mushroom m2 = new Mushroom(8, farmer2, MushroomType.OYSTER);
        Mushroom m3 = new Mushroom(6, null, MushroomType.WHITE);
        Mushroom m4 = new Mushroom(12, farmer1, MushroomType.WILD);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
    }
}