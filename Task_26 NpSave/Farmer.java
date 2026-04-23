class Farmer{
	
	String name;
	String croptype;
	String landsize;
	boolean owner;
	int year;
	boolean sell;
	
	Farmer(String name,
	String croptype,
	String landsize,
	boolean owner,
	int year,
	boolean sell){
		
		this.name=name;
		this.croptype=croptype;
		this.landsize=landsize;
		this.owner=owner;
		this.year=year;
		this.sell=sell;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in  Farmer...");
		System.out.println("name:" + this.name);
		System.out.println("croptype:" + this.croptype);
		System.out.println("landsize:" + this.landsize);
		System.out.println("owner:" + this.owner);
		System.out.println("year:" + this.year);
		System.out.println("sell:" + this.sell);
	}
}