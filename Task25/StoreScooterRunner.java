class StoreScooterRunner{
	public static void main(String[] args)
	{
		String[] scooters= new String[10];
		StoreScooter storeScooter= new StoreScooter(scooters);
		
		storeScooter.getScooterName("Activa");
		storeScooter.getScooterName("Jupiter");
		storeScooter.getScooterName("Access");
		storeScooter.getScooterName("Fascino");
		storeScooter.getScooterName("RayZR");
		storeScooter.getScooterName("Burgman");
		storeScooter.getScooterName("Ntorq");
		storeScooter.getScooterName("Maestro");
		storeScooter.getScooterName("Avenis");
		storeScooter.getScooterName("Pleasure");
		
		System.out.println("Search Found");
		boolean found = storeScooter.searchScooterName("Activa");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeScooter.searchScooterName("Dio");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeScooter.searchScooterName(null);
		System.out.println("Result: " + nullCheck);
	}
}