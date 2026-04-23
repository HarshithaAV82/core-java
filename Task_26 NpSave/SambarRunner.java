class SambarRunner{
	
	
	public static void main(String... values){
		
		
		Sambar sambar1 = new Sambar("Rasam", "red", "tomoto", 66.67, true, true);
		Sambar sambar2 = new Sambar("dal sambar", "yellow", "channa", 22.67, true, true);
		Sambar sambar3 = new Sambar("saggu", "yellow", "potato", 68.97, true, true);
		Sambar sambar4 = new Sambar("drumStick sambar", "red", "drumstick", 66.67, true, true);
		Sambar sambar5 = new Sambar("sprouts sambar", "red", "tomoto", 66.67, true, true);
		Sambar sambar6 = new Sambar("salads", "red", "allvegies", 66.67, true, true);
		Sambar sambar7 = new Sambar("vegetable", "red", "beans", 66.67, true, true);
		Sambar sambar8 = new Sambar("green sambar", "red", "leaves", 66.67, true, true);
		Sambar sambar9 = new Sambar("mild sambar", "red", "tomoto", 66.67, true, true);
		Sambar sambar10 = new Sambar("spicy sambar", "red", "chilli", 66.67, true, true);
		
		
		
	   sambar1.displayInfo();
		sambar2.displayInfo();
	  sambar3.displayInfo();
     sambar4.displayInfo();
		sambar5.displayInfo();
		sambar6.displayInfo();
		sambar7.displayInfo();
	  sambar8.displayInfo();
		sambar10.displayInfo();
		
		Sambar[] sambar = new Sambar[10];
		SambarStore sambarStore = new SambarStore(sambar);
	   sambarStore.saveSambarStore(sambar1);
		sambarStore.saveSambarStore(sambar2);
		sambarStore.saveSambarStore(sambar3);
		sambarStore.saveSambarStore(sambar4);
		sambarStore.saveSambarStore(sambar5);
		sambarStore.saveSambarStore(sambar6);
		sambarStore.saveSambarStore(sambar7);
		sambarStore.saveSambarStore(sambar8);
		sambarStore.saveSambarStore(sambar9);
		sambarStore.saveSambarStore(sambar10);
		
	
	}
}