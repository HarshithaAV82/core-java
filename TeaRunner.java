class TeaRunner{
	
	public static void main(String[]  args){
		
		
		Milk milk = new Milk(20, 10.0);
		milk.getTea();
		Water water = new Water();
		Sugar sugar = new Sugar();
		TeaPowder teaPowder = new TeaPowder();
		Masala masala = new Masala();
		
		Tea tea = new Tea(milk, water, sugar, teaPowder, masala);
		
		
		
	}
}