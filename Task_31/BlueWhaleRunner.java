class BlueWhaleRunner{

    public static void main(String[] args){

        MarineAnimal marineAnimal = new MarineAnimal();
        System.out.println(marineAnimal.age);
        System.out.println(marineAnimal.gender);
        System.out.println(marineAnimal.isMigrating);

       

        MarineAnimal marineAnimal1 = new MarineAnimal(30);
        System.out.println(marineAnimal1.age);
        System.out.println(marineAnimal1.gender);
        System.out.println(marineAnimal1.isMigrating);


        MarineAnimal marineAnimal2 = new MarineAnimal(40, "Male", true);
        System.out.println(marineAnimal2.age);
        System.out.println(marineAnimal2.gender);
        System.out.println(marineAnimal2.isMigrating);
    }
}