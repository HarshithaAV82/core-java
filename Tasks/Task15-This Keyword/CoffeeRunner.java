class CoffeeRunner{
	
	public static void main(String[] args){
		
		Coffee coffee = new Coffee(100, "Cold coffee");
		System.out.println("Coffee Price:" + coffee.price);
		System.out.println("Coffee Type:" + coffee.type);
	}
}