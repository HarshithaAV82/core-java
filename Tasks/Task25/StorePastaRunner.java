class StorePastaRunner{
	public static void main(String[] args)
	{
		String[] pastas= new String[10];
		StorePasta storePasta= new StorePasta(pastas);
		
		storePasta.getPastaName("Macaroni");
		storePasta.getPastaName("Penne");
		storePasta.getPastaName("Spaghetti");
		storePasta.getPastaName("Fusilli");
		storePasta.getPastaName("Rigatoni");
		storePasta.getPastaName("Farfalle");
		storePasta.getPastaName("Lasagna");
		storePasta.getPastaName("Ravioli");
		storePasta.getPastaName("Linguine");
		storePasta.getPastaName("AngelHair");
		
		System.out.println("Search Found");
		boolean found = storePasta.searchPastaName("Macaroni");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storePasta.searchPastaName("ShellPasta");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storePasta.searchPastaName(null);
		System.out.println("Result: " + nullCheck);
	}
}