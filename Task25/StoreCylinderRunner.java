class StoreCylinderRunner{
	public static void main(String[] args)
	{
		String[] cylinders= new String[10];
		StoreCylinder storeCylinder= new StoreCylinder(cylinders);
		
		storeCylinder.getCylinderName("HP");
		storeCylinder.getCylinderName("Indane");
		storeCylinder.getCylinderName("BharatGas");
		storeCylinder.getCylinderName("SuperGas");
		storeCylinder.getCylinderName("RelianceGas");
		storeCylinder.getCylinderName("GoGas");
		storeCylinder.getCylinderName("TotalGas");
		storeCylinder.getCylinderName("AegisGas");
		storeCylinder.getCylinderName("AdaniGas");
		storeCylinder.getCylinderName("MahanagarGas");
		
		System.out.println("Search Found");
		boolean found = storeCylinder.searchCylinderName("HP");
		System.out.println("Result: " + found);

		System.out.println("Search Not Found");
		boolean notFound = storeCylinder.searchCylinderName("ShellGas");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeCylinder.searchCylinderName(null);
		System.out.println("Result: " + nullCheck);
	}
}