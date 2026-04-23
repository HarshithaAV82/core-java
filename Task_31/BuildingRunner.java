class BuildingRunner{

    public static void main(String[] args){

        
        
        Apartment apartment = new Apartment();
        System.out.println("Building Name: " + apartment.buildingName);
        System.out.println("Floors: " + apartment.numberOfFloors);
        System.out.println("Has Lift: " + apartment.hasLift);
	
	
        Apartment apartment1 = new Apartment("Duplex");
        System.out.println("Building Name: " + apartment1.buildingName);
        System.out.println("Floors: " + apartment1.numberOfFloors);
        System.out.println("Has Lift: " + apartment1.hasLift);

		
        Apartment apartment2 = new Apartment("Green Homes", 8, false);
        System.out.println("Building Name: " + apartment2.buildingName);
        System.out.println("Floors: " + apartment2.numberOfFloors);
        System.out.println("Has Lift: " + apartment2.hasLift);
    }
}