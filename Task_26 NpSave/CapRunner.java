class CapRunner{
	
	
	public static void main(String... values){	
		
		Cap cap1 = new Cap("Round", "Fiber", 20, true, true, 3.3, 4.2);
		Cap cap2 = new Cap("Rectangle", "wood", 25, true, true, 4.5, 4.5);
		Cap cap3 = new Cap("square", "Fiber", 20, true, true, 3.3, 4.2);
		Cap cap4 = new Cap("pyramid", "plastic", 40, true, true, 2.2, 3.4);
		Cap cap5 = new Cap("Round", "Fiber", 30, true, true, 4.5, 4.2);
		Cap cap6 = new Cap("Rectangle", "wood", 25, true, true, 4.4, 4.5);
		Cap cap7 = new Cap("square", "Fiber", 33, true, true, 8.3, 4.2);
		Cap cap8 = new Cap("pyramid", "plastic", 40, true, true, 2.9, 3.4);
		Cap cap9 = new Cap("hexagon", "Fiber", 20, true, true, 3.7, 4.2);
		Cap cap10 = new Cap("circle", "wood", 25, true, true, 4.5, 4.5);
		cap1.getInfo();
		cap2.getInfo();
		cap3.getInfo();
		cap4.getInfo();
		cap5.getInfo();
		cap6.getInfo();
		cap7.getInfo();
		cap8.getInfo();
		cap9.getInfo();
		cap10.getInfo();
		
		Cap[] caps = new Cap[10];
		CapStore capStore = new CapStore(caps);
		capStore.saveCapStore(cap1);
		capStore.saveCapStore(cap2);
		capStore.saveCapStore(cap3);
		capStore.saveCapStore(cap4);
		capStore.saveCapStore(cap5);
		capStore.saveCapStore(cap6);
		capStore.saveCapStore(cap7);
		capStore.saveCapStore(cap8);
		capStore.saveCapStore(cap9);
		capStore.saveCapStore(cap10);
	}
}