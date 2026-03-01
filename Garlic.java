class Garlic{
	
    String name;
    String scientificName;
    String color;
    String taste;
    String smell;
    String originCountry;
    String variety;
    String season;
    String shape;
    String usageType; 
    double weight;
    double pricePerKg;
    double length;
    double width; 
    int clovesCount;
    int shelfLifeDays;
    int harvestYear; 
    boolean organic;
    boolean peeled;
    boolean fresh;

	Garlic(String name,String scientificName,String color,String taste,
	String smell,String originCountry,String variety,String season,
	String shape,String usageType,double weight,double pricePerKg,
	double length,double width,int clovesCount,int shelfLifeDays,
	int harvestYear,boolean organic,boolean peeled,boolean fresh){
		
		
		this.name=name;
		this.scientificName=scientificName;
		this.color=color;
		this.taste=taste;
		this.smell=smell;
		this.originCountry=originCountry;
		this.variety=variety;
		this.season=season;
		this.shape=shape;
		this.usageType=usageType;
		this.weight=weight;
		this.pricePerKg=pricePerKg;
		this.length=length;
		this.width=width;
		this.clovesCount=clovesCount;
		this.shelfLifeDays=shelfLifeDays;
		this.harvestYear=harvestYear;
		this.organic=organic;
		this.peeled=peeled;
		this.fresh=fresh;
	}
	
	void paste(){
		System.out.println("name:" + this.name);
		System.out.println("scientificName:" + this.scientificName);
		System.out.println("color:" + this.color);
		System.out.println("taste:" + this.taste);
		System.out.println("smell:" + this.smell);
		System.out.println("originCountry:" + this.originCountry);
		System.out.println("variety:" + this.variety);
		System.out.println("season:" + this.season);
		System.out.println("shape:" + this.shape);
		System.out.println("usageType:" + this.usageType);
		System.out.println("weight:" + this.weight);
		System.out.println("pricePerKg:" + this.pricePerKg);
		System.out.println("length:" + this.length);
		System.out.println("width:" + this.width);
		System.out.println("clovesCount:" + this.clovesCount);
		System.out.println("shelfLifeDays:" + this.shelfLifeDays);
		System.out.println("harvestYear:" + this.harvestYear);
		System.out.println("organic:" + this.organic);
		System.out.println("peeled:" + this.peeled);
		System.out.println("fresh:" + this.fresh);
}
	
}