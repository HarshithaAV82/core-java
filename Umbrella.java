class Umbrella{

    String brand;
    String color;
    double price;
    double length;
    boolean isAutomatic;

	
	Umbrella(String brand, String color, double price, double length, boolean isAutomatic){
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.length = length;
	this.isAutomatic = isAutomatic;
 }
 
   Umbrella(String brand){
	   this.brand=brand;   
   }
   Umbrella(String color, double price){
	   this.color=color;
	   this.price=price;
   }
   Umbrella(String color, double price, double length){
	   this.color=color;
	   this.price=price;
	   this.length=length;
   }
   Umbrella(double length, boolean isAutomatic){
	   this.color=color;
	   this.price=price;
	   this.length=length;
	   this.isAutomatic=isAutomatic;
   }
   Umbrella(String color, double price, double length, boolean isAutomatic){
       this.color=color;
	   this.price=price;
	   this.length=length;
	   this.isAutomatic=isAutomatic;
   }
   Umbrella(){
	   
   }
   
}