class Acid{
	
	String name;
	double price;
	String color;
	boolean quality;
	boolean available;
	boolean strong;
	
	Acid(String name,
	double price,
	String color,
	boolean quality,
	boolean available,
	boolean strong){
		
		this.name=name;
		this.price=price;
		this.color=color;
		this.quality=quality;
		this.available=available;
		this.strong=strong;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in  GUM...");
		System.out.println("name:" + this.name);
		System.out.println("price:" + this.price);
		System.out.println("color:" + this.color);
		System.out.println("quality:" + this.quality);
		System.out.println("available:" + this.available);
		System.out.println("strong:" + this.strong);
	}
}