class CarpenterRunner{
	
	public static void main(String[] args){
		
		String[] names = new String[3];
		names[0] = "maven";
		names[1] = "kiran";
		names[2] = "Manoj";
		
		Wood[] woods = new Wood[3];
		woods[0] = new Wood("Teak", 500);
		woods[1] = new Wood("Rosewood", 700);
		woods[2] = new Wood("Oak", 400);
		
		Carpenter carpenter = new Carpenter(names, woods);
		carpenter.display();
	}
}