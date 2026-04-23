class StatueRunner{
	
	
	public static void main(String... values){
		
		
		Statue statue1 = new Statue("Mohammad arif", "Mysore", 7.7, 4.6, "100" ,true);
		Statue statue2 = new Statue("Mohammad usain", "Mandya", 5.4, 3.5, "140", true);
		Statue statue3 = new Statue("pavan", "Bangalore", 4.5, 4.6, "2000", false);
		Statue statue4 = new Statue("David", "Floreance", 17, 9.6, "1504", true);
		Statue statue5 = new Statue("Venus de Milo", "Museum", 7.7, 4.6, "1300", true);
		Statue statue6 = new Statue("pieta", "Michelagono", 9.7, 4.6, "1489" ,true);
		Statue statue7 = new Statue("Victory", "godness", 5.7, 2.8, "190" ,true);
		Statue statue8 = new Statue("thinker", "Russia", 7.7, 4.6, "2006" , false);
		Statue statue9 = new Statue("anish kappor", "Chicago", 8.9, 4.6, "2006", false);
		Statue statue10 = new Statue("Landowiskida", "Janeiro", 3.4, 9.6, "1900", true);
		
		
		statue1.displayInfo();
		statue2.displayInfo();
		statue3.displayInfo();
		statue4.displayInfo();
		statue5.displayInfo();
		statue6.displayInfo();
		statue7.displayInfo();
		statue8.displayInfo();
		statue9.displayInfo();
		statue10.displayInfo();
		
		
		Statue[] statue = new Statue[10];
		StatueStore statueStore = new StatueStore(statue);
		statueStore.saveStatueStore(statue1);
		statueStore.saveStatueStore(statue2);
		statueStore.saveStatueStore(statue3);
		statueStore.saveStatueStore(statue4);
		statueStore.saveStatueStore(statue5);
		statueStore.saveStatueStore(statue6);
		statueStore.saveStatueStore(statue7);
		statueStore.saveStatueStore(statue8);
		statueStore.saveStatueStore(statue9);
		statueStore.saveStatueStore(statue10);
	}
}