class StorePetroleumCompanyRunner{
	public static void main(String... args)
	{
		String[] companyNames = new String[5];

		StorePetroleumCompany store = new StorePetroleumCompany(companyNames);

		store.getCompanyName("Indian Oil");
		store.getCompanyName("Bharat Petroleum");
		store.getCompanyName("Hindustan Petroleum");
		store.getCompanyName("Shell");
		store.getCompanyName("Nayara Energy");
	}
}