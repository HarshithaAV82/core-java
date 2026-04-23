class Statue{
	
	String sculptureName;
	String location;
	double height;
	double weight;
	String yearOfEstablish;
	boolean ancientPeriodStatue;
	
	Statue(
	String sculptureName,
	String location,
	double height,
	double weight,
	String yearOfEstablish,
	boolean ancientPeriodStatue){
		this.sculptureName=sculptureName;
		this.location=location;
		this.height=height;
		this.weight=weight;
		this.yearOfEstablish=yearOfEstablish;
		this.ancientPeriodStatue=ancientPeriodStatue;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in Statue...");
		System.out.println("SculptureName:" + this.sculptureName);
		System.out.println("location:" + this.location);
		System.out.println("height:" + this.height);
		System.out.println("weight:" + this.weight);
		System.out.println("yearOfEstablish:" + this.yearOfEstablish);
		System.out.println("ancientPeriodStatue:" + this.ancientPeriodStatue);
	}
}