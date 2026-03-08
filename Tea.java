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
	
	void getTeaInfo(){
		
		if(this.milk != null){
			this.milk.getTea();
		}else{
			System.out.println("Milk is null");
		}
		
		if(this.water != null){
			this.water.getTea();
		}else{
			System.out.println("Water is null");
		}
		
		if(this.sugar != null){
			this.sugar.getTea();
		}else{
			System.out.println("Sugar is null");
		}
		
		if(this.teaPowder != null){
			this.teaPowder.getTea();
		}else{
			System.out.println("TeaPowder is null");
		}
		
		if(this.masala != null){
			this.masala.getTea();
		}else{
			System.out.println("Masala is null");
		}
	}
}