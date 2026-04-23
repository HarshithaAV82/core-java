class WallPaper{
	
	String brand;
	String color;
	String desgin;
	String material;
	double price;
	double width;
	double height;
	double thickness;
	String texture;
	boolean washable;
	boolean waterproof;
	boolean peelAndStick;
	String  patternType;
	String roomType;
	String finish;
	String countryOfOrigin;
	String installationType;
	int durabilityRating;
	int stockAvailable;
	String warrantyPeriod;	

  WallPaper(String brand, String color,	String desgin,String material,
	double price, double width, double height, 	double thickness, String texture, 	
	boolean washable, boolean waterproof, boolean peelAndStick, String  patternType, 	
	String roomType,String finish, String countryOfOrigin, String installationType, 	
	int durabilityRating, int stockAvailable, 	String warrantyPeriod){
		
		this.brand=brand;
		this.color=color;
		this.desgin=desgin;
		this.material=material;
		this.price=price;
		this.width=width;
		this.height=height;
		this.thickness=thickness;
		this.texture=texture;
		this.washable=washable;
		this.waterproof=waterproof;
		this.peelAndStick=peelAndStick;
		this.patternType=patternType;
		this.roomType=roomType;
		this.finish=finish;
		this.countryOfOrigin=countryOfOrigin;
		this.installationType=installationType;
		this.durabilityRating=durabilityRating;
		this.stockAvailable=stockAvailable;
		this.warrantyPeriod=warrantyPeriod;
	}
	
	void displayDetails(){
		
		System.out.println("Brand :" + this.brand);
		System.out.println("color:" + this.color);
		System.out.println("desgin :" + this.desgin);
		System.out.println("material :" + this.material);
		System.out.println("price :" + this.price);
		System.out.println("width:" + this.width);
		System.out.println("height :" + this.height);
		System.out.println("thickness :" + this.thickness);
		System.out.println("texture :" + this.texture);
		System.out.println("washable :" + this.washable);
		System.out.println("waterproof :" + this.waterproof);
		System.out.println("peelAndStick:" + this.peelAndStick);
		System.out.println("patternType:" + this.patternType);
		System.out.println("roomType:" + this.roomType);
		System.out.println("finish:" + this.finish);
		System.out.println("countryOfOrigin:" + this.countryOfOrigin);
		System.out.println("installationType:" + this.installationType);
		System.out.println("durabilityRating:" + this.durabilityRating);
		System.out.println("stockAvailable" + this.stockAvailable);
		System.out.println("warrantyPeriod:" + this.warrantyPeriod);	
	}
	
}
	