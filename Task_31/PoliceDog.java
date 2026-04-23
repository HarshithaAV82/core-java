class PoliceDog extends GermanShepherd{

   
    PoliceDog(){
        super("Meat", 30.5, true);
        System.out.println("In this method i have done implicit or default values....");
		System.out.println("running PoliceDog const with no parameters ....");
    }
  
    PoliceDog(String foodType){
        super(foodType, 28.0, true);
        System.out.println("In this method i have done explicit only for foodType... ");
	    System.out.println("running PoliceDog const with having one parameters ....");
    }

    PoliceDog(String foodType, double weight, boolean isVaccinated){
        super(foodType, weight, isVaccinated);
        System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running PoliceDog const with having three parameters ....");
    }
}