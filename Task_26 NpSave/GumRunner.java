class GumRunner{
	
	
	public static void main(String... values){
		
		
		Gum gum1 = new Gum("Fevicol", 100, "green", true, true, true);
		Gum gum2 = new Gum("Fevic", 100, "white", true, true, true);
		Gum gum3 = new Gum("Blueglue", 10, "Blue", true, true, true);
		Gum gum4 = new Gum("liquidglue", 100, "green", true, true, true);
		Gum gum5 = new Gum("Fevicol", 100, "green", true, true, true);
		Gum gum6 = new Gum("glue", 10, "white", true, true, true);
		Gum gum7 = new Gum("transparent", 100, "no color", true, true, true);
		Gum gum8 = new Gum("Fevicol", 200, "green", true, true, true);
		Gum gum9 = new Gum("greenglue", 300, "yellow", true, true, true);
		Gum gum10 = new Gum("glue", 100, "green", true, true, true);
		
		
		
		gum1.displayInfo();
		gum2.displayInfo();
	    gum3.displayInfo();
		gum4.displayInfo();
		gum5.displayInfo();
		gum6.displayInfo();
		gum7.displayInfo();
		gum8.displayInfo();
		gum9.displayInfo();
		gum10.displayInfo();
		
		
		Gum[] gum = new Gum[10];
		GumStore gumStore = new GumStore(gum);
		gumStore.saveGumStore(gum1);
		gumStore.saveGumStore(gum2);
		gumStore.saveGumStore(gum3);
		gumStore.saveGumStore(gum4);
		gumStore.saveGumStore(gum5);
		gumStore.saveGumStore(gum6);
		gumStore.saveGumStore(gum7);
		gumStore.saveGumStore(gum8);
		gumStore.saveGumStore(gum9);
		gumStore.saveGumStore(gum10);
		
	
	}
}