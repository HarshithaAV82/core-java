class Map{
	
	String mapName;
    String mapType;
    String region;
    String country;
    String continent;
    String language;
    String projectionType;
    String publisher;
    String scaleUnit;
    String colorTheme;
    double width;
    double height;
    double scaleRatio;
    double price;
    int yearPublished;
    int numberOfCities;
    int numberOfStates;
    boolean isPolitical;
    boolean isPhysical;
    boolean isDigital;
	
	
	Map(String mapName,String mapType, String region,String country,String continent, String language,
	String projectionType,String publisher,String scaleUnit,String colorTheme,double width,double height,
	double scaleRatio,double price,int yearPublished,int numberOfCities,int numberOfStates,boolean isPolitical,
	boolean isPhysical,boolean isDigital){
		
		this.mapName=mapName;
		this.mapType=mapType;
		this.region=region;
		this.country=country;
		this.continent=continent;
		this.language=language;
		this.projectionType=projectionType;
		this.publisher=publisher;
		this.scaleUnit=scaleUnit;
		this.colorTheme=colorTheme;
		this.width=width;
		this.height=height;
		this.scaleRatio=scaleRatio;
		this.price=price;
		this.yearPublished=yearPublished;
		this.numberOfCities=numberOfCities;
		this.numberOfStates=numberOfStates;
		this.isPolitical=isPolitical;
		this.isPhysical=isPhysical;
		this.isDigital=isDigital;
		
	}
	
	void show(){
		
		System.out.println("mapName:" + this.mapName);
		System.out.println("mapType:" + this.mapType);
		System.out.println("region:" + this.region);
		System.out.println("country:" + this.country);
		System.out.println("continent:" + this.continent);
		System.out.println("language:" + this.language);
		System.out.println("projectionType:" + this.projectionType);
		System.out.println("publisher:" + this.publisher);
		System.out.println("scaleUnit:" + this.scaleUnit);
		System.out.println("colorTheme:" + this.colorTheme);
		System.out.println("width:" + this.width);
		System.out.println("height:" + this.height);
		System.out.println("scaleRatio:" + this.scaleRatio);
		System.out.println("price:" + this.price);
		System.out.println("yearPublished:" + this.yearPublished);
		System.out.println("numberOfCities:" + this.numberOfCities);
		System.out.println("numberOfStates:" + this.numberOfStates);
		System.out.println("isPolitical:" + this.isPolitical);
		System.out.println("isPhysical:" + this.isPhysical);
		System.out.println("isDigital:" + this.isDigital);
		
	}
	
}

