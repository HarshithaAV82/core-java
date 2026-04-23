class Paper{
	
    String brand;
    String type;            
    String material;      
    String color;
    double gsm;               
    double length;
    double width;
    int sheetCount;
    double price;
    boolean recycled;
    boolean waterproof;
    boolean acidFree;
    String texture;
    String finish;            
    String usageType;  
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    int stockAvailable;
    String certification;    
	
	Paper(String brand,String type,String material,String color,double gsm,double length,double width,
	int sheetCount,double price,boolean recycled,boolean waterproof,boolean acidFree,String texture,
	String finish,String usageType,String manufacturer,String countryOfOrigin,String packagingType,
	int stockAvailable,String certification){
		
		this.brand=brand;
		this.type=type;
		this.material=material;
		this.color=color;
		this.gsm=gsm;
		this.length=length;
		this.width=width;
		this.sheetCount=sheetCount;
		this.price=price;
		this.recycled=recycled;
		this.waterproof=waterproof;
		this.acidFree=acidFree;
		this.texture=texture;
		this.finish=finish;
		this.usageType=usageType;
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.packagingType=packagingType;
		this.stockAvailable=stockAvailable;
		this.certification=certification;
	
	}
	
	void list(){
		System.out.println("brand:" + this.brand);
		System.out.println("type:" + type);
		System.out.println("material:" + material);
		System.out.println("color:" + color);
		System.out.println("gsm:" + gsm);
		System.out.println("length:" + length);
		System.out.println("width:" + width);
		System.out.println("sheetCount:" + sheetCount);
		System.out.println("price:" + price);
		System.out.println("recycled:" + recycled);
		System.out.println("waterproof:" + waterproof);
		System.out.println("acidFree:" + acidFree);
		System.out.println("texture:" + texture);
		System.out.println("finish:" + finish);
		System.out.println("usageType:" + usageType);
		System.out.println("manufacturer:" + manufacturer);
		System.out.println("countryOfOrigin:" + countryOfOrigin);
		System.out.println("packagingType:" + packagingType);
		System.out.println("stockAvailable:" + stockAvailable);
		System.out.println("certification:" + certification);
		
	}
	
}