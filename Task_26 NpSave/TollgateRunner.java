class TollgateRunner{
	
	
	public static void main(String... values){
		
		Tollgate tollgate1 = new Tollgate("Bangalore", 3.4, 100.0, "twoWheeler", true, true);
		Tollgate tollgate2 = new Tollgate("Mysore", 2.4, 200.0, "fourWheeler", true, true);
		Tollgate tollgate3 = new Tollgate("shimoga", 4.4, 300.0, "twoWheeler", true, true);
		Tollgate tollgate4 = new Tollgate("bijapur", 5.4, 100.0, "twoWheeler", true, true);
		Tollgate tollgate5 = new Tollgate("Tiptur", 8.4, 100.0, "twoWheeler", true, true);
		Tollgate tollgate6 = new Tollgate("Banavara", 9.4, 100.0, "fourWheeler", true, true);
		Tollgate tollgate7 = new Tollgate("Mangalore", 60.4, 100.0, "twoWheeler", true, true);
		Tollgate tollgate8 = new Tollgate("Sira", 90.4, 100.0, "twoWheeler", true, true);
		Tollgate tollgate9 = new Tollgate("tumkuru", 30.4, 100.0, "fourWheeler", true, true);
		Tollgate tollgate10 = new Tollgate("Hassan", 10.0, 100.0, "twoWheeler", true, true);
		
		
		tollgate1.displayInfo();
		tollgate2.displayInfo();
		tollgate3.displayInfo();
		tollgate4.displayInfo();
		tollgate5.displayInfo();
		tollgate6.displayInfo();
		tollgate7.displayInfo();
		tollgate8.displayInfo();
		tollgate9.displayInfo();
		tollgate10.displayInfo();
		
		
		Tollgate[] tollgate = new Tollgate[10];
		TollgateStore tollgateStore = new TollgateStore(tollgate);
		tollgateStore.saveTollgateStore(tollgate1);
		tollgateStore.saveTollgateStore(tollgate2);
		tollgateStore.saveTollgateStore(tollgate3);
		tollgateStore.saveTollgateStore(tollgate4);
		tollgateStore.saveTollgateStore(tollgate5);
		tollgateStore.saveTollgateStore(tollgate6);
		tollgateStore.saveTollgateStore(tollgate7);
		tollgateStore.saveTollgateStore(tollgate8);
		tollgateStore.saveTollgateStore(tollgate9);
		tollgateStore.saveTollgateStore(tollgate10);
	}
}