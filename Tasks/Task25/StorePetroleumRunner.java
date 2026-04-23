class StorePetroleumRunner{
	public static void main(String[] args)
	{
		String[] petroleum= new String[10];
		StorePetroleum storePetroleum= new StorePetroleum(petroleum);
		
		storePetroleum.getPetroleumName("Petrol");
		storePetroleum.getPetroleumName("Diesel");
		storePetroleum.getPetroleumName("Kerosene");
		storePetroleum.getPetroleumName("LPG");
		storePetroleum.getPetroleumName("CNG");
		storePetroleum.getPetroleumName("AviationFuel");
		storePetroleum.getPetroleumName("FuelOil");
		storePetroleum.getPetroleumName("Bitumen");
		storePetroleum.getPetroleumName("LubricantOil");
		storePetroleum.getPetroleumName("Naphtha");
		
		System.out.println("Search Found");
		boolean found = storePetroleum.searchPetroleumName("Diesel");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storePetroleum.searchPetroleumName("BioFuel");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storePetroleum.searchPetroleumName(null);
		System.out.println("Result: " + nullCheck);
		
		
		
		storePetroleum.update(1, "BioDiesel");
		storePetroleum.update("GreenFuel", "CNG");

		storePetroleum.delete(2);
		storePetroleum.delete("Bitumen");
	}
}