class DcMotor{
	
	String name;
	double eletricSupply;
	
	
	DcMotor(String name, double eletricSupply){
		this.name=name;
		this.eletricSupply=eletricSupply;
	}
	void getMotor(){
		System.out.println("Motor info , name:" + this.name + ", eletricSupply:" +this.eletricSupply);
	}
}