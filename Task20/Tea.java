class Tea{
	
	String name;
	int price;
	double quantity;
	boolean healthy;
	boolean hot;
	
	Milk milk;
	Water water;
	Sugar sugar;
	TeaPowder teaPowder;
	Masala masala;
	
	Tea(Milk milk, Water water, Sugar sugar, TeaPowder teaPowder, Masala masala){
		
		this.milk=milk;
		this.water=water;
		this.sugar=sugar;
		this.teaPowder=teaPowder;
		this.masala=masala;
		
		
		System.out.println("Created Tea using  milk water sugar teaPowder masala with const");
	}
	
	
}