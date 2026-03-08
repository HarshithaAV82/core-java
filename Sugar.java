class Sugar{
	
	int price;
	double quantity;
	
	Sugar(int price, double quantity){
		this.price = price;
		this.quantity = quantity;
	}
	
	void getTea(){
		System.out.println("Sugar Price: " + this.price);
		System.out.println("Sugar Quantity: " + this.quantity);
	}
}