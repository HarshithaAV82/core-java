class FarmerRunner{
	
	
	public static void main(String... values){
		
		
		Farmer farmer1 = new Farmer("srinivas", "paddy", "2.4", true, 6, true);
		Farmer farmer2 = new Farmer("vasu", "corn", "6.4", true, 9, true);
		Farmer farmer3 = new Farmer("venkatesh", "Carrot", "5.4", true, 7, true);
		Farmer farmer4 = new Farmer("Raghu", "sweetcorn", "8.4", true, 3, true);
		Farmer farmer5 = new Farmer("Raju", "beans", "2.4", true, 6, false);
		Farmer farmer6 = new Farmer("Mohan", "ginger", "1.4", true, 7, true);
		Farmer farmer7 = new Farmer("sudarsh", "garlic", "1.4", true, 3, false);
		Farmer farmer8 = new Farmer("darshan", "orange", "5.6", true, 6, true);
		Farmer farmer9 = new Farmer("suraj", "Apple", "7.4", true, 10, false);
		Farmer farmer10 = new Farmer("sumanth", "paddy", "8.4", true, 4, true);
		
		
		farmer1.displayInfo();
		farmer2.displayInfo();
	    farmer3.displayInfo();
		farmer4.displayInfo();
		farmer5.displayInfo();
		farmer6.displayInfo();
		farmer7.displayInfo();
		farmer8.displayInfo();
		farmer9.displayInfo();
		farmer10.displayInfo();
		
		
		Farmer[] farmer = new Farmer[10];
		FarmerStore farmerStore = new FarmerStore(farmer);
		farmerStore.saveFarmerStore(farmer1);
		farmerStore.saveFarmerStore(farmer2);
		farmerStore.saveFarmerStore(farmer3);
		farmerStore.saveFarmerStore(farmer4);
		farmerStore.saveFarmerStore(farmer5);
		farmerStore.saveFarmerStore(farmer6);
		farmerStore.saveFarmerStore(farmer7);
		farmerStore.saveFarmerStore(farmer8);
		farmerStore.saveFarmerStore(farmer9);
		farmerStore.saveFarmerStore(farmer10);
		
	
	}
}