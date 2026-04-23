class SmartClock extends Clock{
	
	boolean chargeable;
	double screenTime;
	boolean warranty;
	boolean quality;
	boolean gps;
	
	
	SmartClock(){
		
		super();
		System.out.println("executing smartclock in SmartClock...");
	}
	
	void displayFunction(){
		
		System.out.println("executing displayFunction in SmartClock....");
	}
}