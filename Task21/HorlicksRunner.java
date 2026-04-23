class HorlicksRunner{

    public static void main(String[] args){

        HorlicksBrand HorlicksBrand1 = new HorlicksBrand("babies Horlicks");
        HorlicksBrand HorlicksBrand2 = new HorlicksBrand("Women's Horlicks");

        Horlicks horlicks1 = new Horlicks(2, HorlicksBrand1, Flavor.CLASSIC);
        Horlicks horlicks2 = new Horlicks(3, HorlicksBrand2, Flavor.CHOCOLATE);
        Horlicks horlicks3 = new Horlicks(1, null, Flavor.MALT);
        Horlicks horlicks4 = new Horlicks(4, HorlicksBrand2, Flavor.VANILLA);

        horlicks1.printInfo();
        horlicks2.printInfo();
        horlicks3.printInfo();
        horlicks4.printInfo();
    }
}