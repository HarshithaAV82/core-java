class ClothRunner{
	
	
	public static void main(String... values){
		
		
		Cloth cloth1 = new Cloth("Cotton", 500.0, "zudio", "Black", true, true);
		Cloth cloth2 = new Cloth("nylon", 600.0, "peterEngland", "White", true, true);
		Cloth cloth3 = new Cloth("fabric", 800.0, "Ramraj", "Green", true, true);
		Cloth cloth4 = new Cloth("woolen", 900.0, "zudio", "pink", true, true);
		Cloth cloth5 = new Cloth("polyester", 500.0, "vishalMart", "Black", true, true);
		Cloth cloth6 = new Cloth("denim", 900.0, "Trends", "yellow", true, true);
		Cloth cloth7 = new Cloth("wool", 500.0, "allenswolley", "orange", true, true);
		Cloth cloth8 = new Cloth("Pvc", 500.0, "Redrape", "green", true, true);
		Cloth cloth9 = new Cloth("Rayon", 300.0, "Max", "Black", true, true);
		Cloth cloth10 = new Cloth("Silk", 700.0, "Puma", "purple", true, true);
		
		cloth1.displayInfo();
		cloth2.displayInfo();
		cloth3.displayInfo();
		cloth4.displayInfo();
		cloth5.displayInfo();
		cloth6.displayInfo();
		cloth7.displayInfo();
		cloth8.displayInfo();
		cloth9.displayInfo();
		cloth10.displayInfo();
		
		
		Cloth[] cloth = new Cloth[10];
		ClothStore clothStore = new ClothStore(cloth);
		clothStore.saveClothStore(cloth1);
		clothStore.saveClothStore(cloth2);
		clothStore.saveClothStore(cloth3);
		clothStore.saveClothStore(cloth4);
		clothStore.saveClothStore(cloth5);
		clothStore.saveClothStore(cloth6);
		clothStore.saveClothStore(cloth7);
		clothStore.saveClothStore(cloth8);
		clothStore.saveClothStore(cloth9);
		clothStore.saveClothStore(cloth10);
		
	}
}