class Stand{
	
    String standName;
    String standType;
    String material;
    String color;
    String brand;
    String model;
    String shape;
    String usagePurpose;
    String countryOfOrigin;
    String warrantyPeriod;
    double height;
    double width;
    double weight;
    double price;
    int capacity;
    int durabilityRating;
    int yearOfManufacture;
    boolean foldable;
    boolean adjustable;
    boolean waterproof;
	
	Stand(String standName,String standType,String material,String color,String brand,
	String model,String shape,String usagePurpose,String countryOfOrigin,String warrantyPeriod,
	double height,double width,double weight,double price,int capacity,int durabilityRating,
	int yearOfManufacture,boolean foldable,boolean adjustable,boolean waterproof){
		
		this.standName=standName;
		this.standType=standType;
		this.material=material;
		this.color=color;
		this.brand=brand;
		this.model=model;
		this.shape=shape;
		this.usagePurpose=usagePurpose;
		this.countryOfOrigin=countryOfOrigin;
		this.warrantyPeriod=warrantyPeriod;
		this.height=height;
		this.width=width;
		this.weight=weight;
		this.price=price;
		this.capacity=capacity;
		this.durabilityRating=durabilityRating;
		this.yearOfManufacture=yearOfManufacture;
		this.foldable=foldable;
		this.adjustable=adjustable;
		this.waterproof=waterproof;		
	}
	
	void type(){
		System.out.println("standName:" + this.standName);
		System.out.println("standType:" + this.standType);
		System.out.println("material:" + this.material);
		System.out.println("color:" + this.color);
		System.out.println("brand:" + this.brand);
		System.out.println("model:" + this.model);
		System.out.println("shape:" + this.shape);
		System.out.println("usagePurpose:" + this.usagePurpose);
		System.out.println("countryOfOrigin:" + this.countryOfOrigin);
		System.out.println("warrantyPeriod:" + this.warrantyPeriod);
		System.out.println("height:" + this.height);
		System.out.println("width:" + this.width);
		System.out.println("weight:" + this.weight);
		System.out.println("price:" + this.price);
		System.out.println("capacity:" + this.capacity);
		System.out.println("durabilityRating" + this.durabilityRating);
		System.out.println("yearOfManufacture:" + this.yearOfManufacture);
		System.out.println("foldable:" + this.foldable);
		System.out.println("adjustable:" + this.adjustable);
		System.out.println("waterproof:" + this.waterproof);
		
	}
	
}