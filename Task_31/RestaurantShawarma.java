class RestaurantShawarma extends Shawarma{

    RestaurantShawarma() {
        super("Chicken", 120.0, true);
        System.out.println("In this method i have done implicit or default values....");
		System.out.println("running RestaurantShawarma const with no parameters ....");
    }

 
    RestaurantShawarma(String type){
        super(type, 150.0, true);
        System.out.println("In this method i have done explicit only for type.. ");
	    System.out.println("running RestaurantShawarma const with having one parameters ....");
    }

    RestaurantShawarma(String type, double price, boolean isSpicy){
        super(type, price, isSpicy);
        System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running RestaurantShawarma const with having three parameters ....");
    }
}