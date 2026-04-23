class InductionMotor{
	
	String type;
	Boolean warranty;
	
	InductionMotor(String type, Boolean warranty){
		this.type=type;
		this.warranty=warranty;
	}
	void getMotor(){
		
		System.out.println("InductionMotor , type:" + this.type + ", warranty:" +this.warranty);
	}
}