class Cloth{
	
	String clothType;
	double  price;
	String brand;
	String color;
	boolean quality;
	boolean available;
	
	Cloth(String clothType,
	double  price,
	String brand,
	String color,
	boolean quality,
	boolean available){
		this.clothType=clothType;
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.quality=quality;
		this.available=available;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in Cloth...");
		System.out.println("clothType:" + this.clothType);
		System.out.println("price:" + this.price);
		System.out.println("brand:" + this.brand);
		System.out.println("color:" + this.color);
		System.out.println("quality:" + this.quality);
		System.out.println("available:" + this.available);
	}
}