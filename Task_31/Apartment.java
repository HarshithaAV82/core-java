class Apartment extends Building{

    
    Apartment(){
        super("Default Building", 5, true);
		System.out.println("In this method i have done implicit or default values....");
		System.out.println("running Apartment const with no parameters ....");
    }

    Apartment(String buildingName){
        super(buildingName, 10, true);
		System.out.println("In this method i have done explicit only for buildingName... ");
	    System.out.println("running Apartment const with having one parameters ....");
    }

    
    Apartment(String buildingName, int numberOfFloors, boolean hasLift){
        super(buildingName, numberOfFloors, hasLift);
		System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running Apartment const with having three parameters ....");
	}
}