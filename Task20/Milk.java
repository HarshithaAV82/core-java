class Milk{
	
	int price;
	double quantity;
	
	Milk(int price, double quantity){
		this.price=price;
		this.quantity=quantity;
	}
	
	void getTea(){
		
		System.out.println("quantity:" + quantity);
		System.out.println("Price:" + this.price);
		System.out.println("created Milk using const..");
		
		
	}
}