class NonVeg extends Chicken{

   
    NonVeg(){
        super("Local Farm", 101, true);
        System.out.println("In this method i have done implicit or default values....");
		System.out.println("running NonVeg const with no parameters ....");
    }

    NonVeg(String farmName){
        super(farmName, 200, true);
        System.out.println("In this method i have done explicit only for farmName... ");
	    System.out.println("running NonVeg const with having one parameters ....");
    }

    NonVeg(String farmName, int batchNumber, boolean isVaccinated){
        super(farmName, batchNumber, isVaccinated);
        System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running NonVeg const with having three parameters ....");
    }
}