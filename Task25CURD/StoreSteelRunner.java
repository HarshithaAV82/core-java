class StoreSteelRunner{
	public static void main(String[] args)
	{
		String[] steels= new String[10];
		StoreSteel storeSteel= new StoreSteel(steels);
		
		storeSteel.getSteelName("TataSteel");
		storeSteel.getSteelName("JSWSteel");
		storeSteel.getSteelName("SAIL");
		storeSteel.getSteelName("JindalSteel");
		storeSteel.getSteelName("EssarSteel");
		storeSteel.getSteelName("BhushanSteel");
		storeSteel.getSteelName("VizagSteel");
		storeSteel.getSteelName("AMNSteel");
		storeSteel.getSteelName("UshaSteel");
		storeSteel.getSteelName("KamdhenuSteel");
		
		System.out.println("Search Found");
		boolean found = storeSteel.searchSteelName("TataSteel");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeSteel.searchSteelName("UltraSteel");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeSteel.searchSteelName(null);
		System.out.println("Result: " + nullCheck);
		
		storeSteel.update(1, "MegaSteel");
        storeSteel.update("UltraSteel", "SAIL");

        storeSteel.delete(0);
        storeSteel.delete("MegaSteel");
		
	}
}