class StoreTurbineRunner{
	public static void main(String[] args)
	{
		String[] turbines= new String[10];
		StoreTurbine storeTurbine= new StoreTurbine(turbines);
		
		storeTurbine.getTurbineName("GasTurbine");
		storeTurbine.getTurbineName("SteamTurbine");
		storeTurbine.getTurbineName("WindTurbine");
		storeTurbine.getTurbineName("HydraulicTurbine");
		storeTurbine.getTurbineName("JetTurbine");
		storeTurbine.getTurbineName("KaplanTurbine");
		storeTurbine.getTurbineName("FrancisTurbine");
		storeTurbine.getTurbineName("ImpulseTurbine");
		storeTurbine.getTurbineName("ReactionTurbine");
		storeTurbine.getTurbineName("MicroTurbine");
		
		System.out.println("Search Found");
		boolean found = storeTurbine.searchTurbineName("GasTurbine");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeTurbine.searchTurbineName("MegaTurbine");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeTurbine.searchTurbineName(null);
		System.out.println("Result: " + nullCheck);
	}
}