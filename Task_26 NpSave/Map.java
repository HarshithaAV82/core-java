class Map{
	
	
	String location;
	String directions;
	boolean available;
	boolean shortCutroute;
	String startPoint;
	String destinationPoint;
	
	Map(String location,
	String directions,
	boolean available,
	boolean shortCutroute,
	String startPoint,
	String destinationPoint){
		
		
		this.location=location;
		this.directions=directions;
		this.available=available;
		this.shortCutroute=shortCutroute;
		this.startPoint=startPoint;
		this.destinationPoint=destinationPoint;
	}
	
	void getDetails(){
		
		System.out.println("executing getDetails in Map...");
		System.out.println("location:" + this.location);
		System.out.println("directions:" + this.directions);
		System.out.println("available:" + this.available);
		System.out.println("shortCutroute:" + this.shortCutroute);
		System.out.println("startPoint:" + this.startPoint);
		System.out.println("destinationPoint:" + this.destinationPoint);
	}
}