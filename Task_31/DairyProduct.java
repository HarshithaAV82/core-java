class DairyProduct extends Butter{

    DairyProduct(){
        super("Amul", 50.0, "Packet");
        System.out.println("In this method i have done implicit or default values....");
		System.out.println("running DairyProduct const with no parameters ....");
    }

  
    DairyProduct(String brandName){
        super(brandName, 70.0, "Box");
        System.out.println("In this method i have done explicit only for brandName... ");
	    System.out.println("running DairyProduct const with having one parameters ....");
    }
   
    DairyProduct(String brandName, double price, String packagingType){
        super(brandName, price, packagingType);
        System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running DairyProduct const with having three parameters ....");
    }
}