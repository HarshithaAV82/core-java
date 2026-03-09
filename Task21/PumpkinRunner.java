class PumpkinRunner{

    public static void main(String[] args){

        Farmerr farmer1 = new Farmerr("Harshitha");
        Farmerr farmer2 = new Farmerr("Hema");

        Pumpkin pumpkin1 = new Pumpkin(10, farmer1, PumpkinType.ORANGE);
        Pumpkin pumpkin2 = new Pumpkin(8, null, PumpkinType.GREEN);
        Pumpkin pumpkin3 = new Pumpkin(12, null, PumpkinType.WHITE);
        Pumpkin pumpkin4 = new Pumpkin(15, farmer1, PumpkinType.YELLOW);

        pumpkin1.printInfo();
        pumpkin2.printInfo();
        pumpkin3.printInfo();
        pumpkin4.printInfo();
    }
}