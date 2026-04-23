class MusuemCreator{
	
	static void getMusuem(String name, String location){
		
		System.out.println("create a new musuem");
		Musuem musuem = new Musuem("National Musuem", "Dehli");
		System.out.println("Musuem name:" + musuem.name);
		System.out.println("Musuem Location:" + musuem.location);
		System.out.println("Musuem is created....");
	}
	static void getMusuem(String name){
		Musuem musuem = new Musuem(name);
		System.out.println("Musuem name:" + musuem.name);
		System.out.println("The another Musuem name is created..");
		
	}
	static void getMusuem(){
		System.out.println("create a new musuem with no parameter..");
		Musuem musuem = new Musuem();
		System.out.println("Musuem name:" + musuem.name);
		System.out.println("Musuem Location:" + musuem.location);
		System.out.println("Musuem is created..");
				
	}
}