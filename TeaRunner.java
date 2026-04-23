class TeaRunner{
	
	public static void main(String[] args){
		
		Milk milk = new Milk(20, 10.0);
		
		Water water = new Water("Filtered", 5);
		
		Sugar sugar = new Sugar(40, 2.0);
		
		TeaPowder teaPowder = new TeaPowder(150, "Tata Tea");
		
		Masala masala = new Masala("Ginger", true);
		
		Tea tea = new Tea(milk, water, sugar, teaPowder, masala);
		
		tea.getTeaInfo();
	}
}