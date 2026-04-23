class AcidRunner{
	
	
	public static void main(String... values){
		
		
		Acid acid1 = new Acid("hydrogyclerin", 100, "green", true, true, true);
		Acid acid2 = new Acid("gyclerin", 500, "paleyellow", true, true, true);
		Acid acid3 = new Acid("HCL", 1000, "white", true, true, true);
		Acid acid4 = new Acid("hydrogen", 800, "transparent", true, true, true);
		Acid acid5 = new Acid("Nacl", 1000, "white", true, true, true);
		Acid acid6 = new Acid("Sodium", 5000, "white", true, true, true);
		Acid acid7 = new Acid("potassium", 900, "Pink", true, true, true);
		Acid acid8 = new Acid("magnesium", 500, "green", true, true, true);
		Acid acid9 = new Acid("niacinamide", 180, "white", true, true, true);
		Acid acid10 = new Acid("vitaminc", 300, "palewhite", true, true, true);
		
		
		acid1.displayInfo();
		acid2.displayInfo();
	   acid3.displayInfo();
		acid4.displayInfo();
		acid5.displayInfo();
		acid6.displayInfo();
		acid7.displayInfo();
	   acid8.displayInfo();
		acid9.displayInfo();
     	acid10.displayInfo();
		
		
		Acid[] acid = new Acid[10];
		AcidStore acidStore = new AcidStore(acid);
		acidStore.saveAcidStore(acid1);
		acidStore.saveAcidStore(acid2);
		acidStore.saveAcidStore(acid3);
		acidStore.saveAcidStore(acid4);
		acidStore.saveAcidStore(acid5);
		acidStore.saveAcidStore(acid6);
		acidStore.saveAcidStore(acid7);
		acidStore.saveAcidStore(acid8);
		acidStore.saveAcidStore(acid9);
		acidStore.saveAcidStore(acid10);
		
	
	}
}