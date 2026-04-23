class StoreTreeRunner{
	public static void main(String[] args)
	{
		String[] trees= new String[10];
		StoreTree storeTree= new StoreTree(trees);
		
		storeTree.getTreeName("Neem");
		storeTree.getTreeName("Mango");
		storeTree.getTreeName("Banyan");
		storeTree.getTreeName("Peepal");
		storeTree.getTreeName("Coconut");
		storeTree.getTreeName("Teak");
		storeTree.getTreeName("Rosewood");
		storeTree.getTreeName("Oak");
		storeTree.getTreeName("Pine");
		storeTree.getTreeName("Ashoka");
		
		System.out.println("Search Found");
		boolean found = storeTree.searchTreeName("Neem");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeTree.searchTreeName("AppleTree");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeTree.searchTreeName(null);
		System.out.println("Result: " + nullCheck);
	}
}