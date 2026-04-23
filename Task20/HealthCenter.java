class HealthCenter{
	
	String type;
	int noOfAssitance;
	
	
	HealthCenter(String type, int noOfAssitance){
		
		this.type=type;
		this.noOfAssitance=noOfAssitance;
	}
	
	void getSpa(){
		
		System.out.println("Spa Type:" + this.type);
		System.out.println("noOfAssitance:" + this.noOfAssitance);
		
		System.out.println("Created HealthCenter using const..");
	}
}