class StoreKettleRunner{
	public static void main(String[] args)
	{
		String[] kettles= new String[10];
		StoreKettle storeKettle= new StoreKettle(kettles);
		
		storeKettle.getKettleName("ElectricKettle");
		storeKettle.getKettleName("SteelKettle");
		storeKettle.getKettleName("GlassKettle");
		storeKettle.getKettleName("TravelKettle");
		storeKettle.getKettleName("CordlessKettle");
		storeKettle.getKettleName("TeaKettle");
		storeKettle.getKettleName("SmartKettle");
		storeKettle.getKettleName("MiniKettle");
		storeKettle.getKettleName("ThermalKettle");
		storeKettle.getKettleName("DigitalKettle");
		
		System.out.println("Search Found");
		boolean found = storeKettle.searchKettleName("ElectricKettle");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeKettle.searchKettleName("PlasticKettle");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeKettle.searchKettleName(null);
		System.out.println("Result: " + nullCheck);
	}
}