class ChickenRunner{

    public static void main(String[] args){

        NonVeg nonVeg = new NonVeg();
        System.out.println(nonVeg.farmName);
        System.out.println(nonVeg.batchNumber);
        System.out.println(nonVeg.isVaccinated);
 
        NonVeg nonVeg1 = new NonVeg("Green Farm");
        System.out.println(nonVeg1.farmName);
        System.out.println(nonVeg1.batchNumber);
        System.out.println(nonVeg1.isVaccinated);

        NonVeg nonVeg2 = new NonVeg("Organic Farm", 300, false);
        System.out.println(nonVeg2.farmName);
        System.out.println(nonVeg2.batchNumber);
        System.out.println(nonVeg2.isVaccinated);
    }
}