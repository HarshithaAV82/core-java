class ElectricMotor{
	
	String name;
	int price;
	
	ElectricMotor(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	void getMotor(){
		System.out.println("ElectricMotor , name:" +this.name +", price:" +this.price);
	}
	
}