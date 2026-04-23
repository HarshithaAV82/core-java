class Cap{
	
	
	String capType;
	String material;
	double price;
	boolean checkAvailablity;
	boolean quality;
	double size;
	double ratings;
	
	
	Cap(String capType,
	String material,
	double price,
	boolean checkAvailablity,
	boolean quality,
	double size,
	double ratings){
		
		this.capType=capType;
		this.material=material;
		this.price=price;
		this.checkAvailablity=checkAvailablity;
		this.quality=quality;
		this.size=size;
		this.ratings=ratings;
		
	}
	
	void getInfo(){
	
		System.out.println("Executing getInfo in Cap...");
		System.out.println("capType:" + this.capType);
		System.out.println("material:" + this.material);
		System.out.println("price:" + this.price);
		System.out.println("checkAvailablity:" + this.checkAvailablity);
		System.out.println("quality:" + this.quality);
		System.out.println("size:" +this.size);
		System.out.println("ratings:" +this.ratings);
	}
}