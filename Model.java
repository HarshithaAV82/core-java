class Model{
	
	String name;
	double price;
	
	Model(String name, double price){
		
		this.name=name;
		this.price=price;
	}
	void getInfo(){
		System.out.println("Model Info , name:" + this.name + ", price:" + this.price);
	}
}