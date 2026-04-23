class AcMotor{
	
	String type = "Electric";
	double speed = 55.4;
	
	AcMotor(String type, double speed){
		this.type=type;
		this.speed=speed;
	}
	
	void getMotor(){
		
		System.out.println("Motor type:" + this.type);
		System.out.println("Motor Speed:"+ this.speed);
		
		
		System.out.println("Created AcMotor using const..");
	}
	
}