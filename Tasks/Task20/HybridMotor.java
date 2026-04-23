class HybridMotor{
	
	String name;
	double power;
	
	HybridMotor(String name, double power){
		
		this.name=name;
		this.power=power;
	}
	void getMotor(){
		
		System.out.println("HybridMotor name:" + this.name + ", power:" + this.power);
	}
}