class GermanShepherdRunner{

    public static void main(String[] args) {

        PoliceDog dog = new PoliceDog();
        System.out.println(dog.foodType);
        System.out.println(dog.weight);
        System.out.println(dog.isVaccinated);

        
        PoliceDog dog1 = new PoliceDog("Chicken");
        System.out.println(dog1.foodType);
        System.out.println(dog1.weight);
        System.out.println(dog1.isVaccinated);


        PoliceDog dog2 = new PoliceDog("Fish", 32.0, false);
        System.out.println(dog2.foodType);
        System.out.println(dog2.weight);
        System.out.println(dog2.isVaccinated);
    }
}