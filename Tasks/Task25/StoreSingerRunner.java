class StoreSingerRunner{
	public static void main(String[] args)
	{
		String[] singers= new String[10];
		StoreSinger storeSinger= new StoreSinger(singers);
		
		storeSinger.getSingerName("ArijitSingh");
		storeSinger.getSingerName("ShreyaGhoshal");
		storeSinger.getSingerName("SonuNigam");
		storeSinger.getSingerName("KK");
		storeSinger.getSingerName("LataMangeshkar");
		storeSinger.getSingerName("AshaBhosle");
		storeSinger.getSingerName("SPBalasubrahmanyam");
		storeSinger.getSingerName("SunidhiChauhan");
		storeSinger.getSingerName("ArmaanMalik");
		storeSinger.getSingerName("NehaKakkar");
		
		System.out.println("Search Found");
		boolean found = storeSinger.searchSingerName("KK");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeSinger.searchSingerName("SidSriram");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeSinger.searchSingerName(null);
		System.out.println("Result: " + nullCheck);
	}
}