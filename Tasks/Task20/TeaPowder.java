class TeaPowder{
	
	int price;
	String name;
	
	TeaPowder(int price, String name){
		this.price = price;
		this.name = name;
	}
	
	void getTea(){
		System.out.println("TeaPowder Name: " + this.name);
		System.out.println("TeaPowder Price: " + this.price);
	}
}