class Sambar{
	
	String name;
	String color;
	String vegetable;
	double quantity;
	boolean hot;
	boolean available;
	
	Sambar(String name,
	String color,
	String vegetable,
	double quantity,
	boolean hot,
	boolean available){
		
		this.name=name;
		this.color=color;
		this.vegetable=vegetable;
		this.quantity=quantity;
		this.hot=hot;
		this.available=available;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in  Sambar...");
		System.out.println("name:" + this.name);
		System.out.println("color:" + this.color);
		System.out.println("vegetable:" + this.vegetable);
		System.out.println("quantity:" + this.quantity);
		System.out.println("hot:" + this.hot);
		System.out.println("available:" + this.available);
	}
	
}