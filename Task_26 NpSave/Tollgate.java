class Tollgate{
	
	String district;
	double fees;
	double distance;
	String vechileType;
	boolean compulsory;
	boolean anyTime;
	
	Tollgate(
	String district,
	double fees,
	double distance,
	String vechileType,
	boolean compulsory,
	boolean AnyTime	){
		this.district=district;
		this.fees=fees;
		this.distance=distance;
		this.vechileType=vechileType;
		this.compulsory=compulsory;
		this.anyTime=anyTime;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in Tollgate...");
		System.out.println("district:" + this.district);
		System.out.println("fees:" + this.fees);
		System.out.println("distance:" + this.distance);
		System.out.println("vechileType:" + this.vechileType);
		System.out.println("compulsory:" + this.compulsory);
		System.out.println("anyTime:" + this.anyTime);
	}
}