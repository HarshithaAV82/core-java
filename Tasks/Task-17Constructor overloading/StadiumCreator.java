class StadiumCreator{
	
	
	static void getStadium(){
		System.out.println("creating stadium with no parameters.");
		Stadium stadium = new Stadium();
		System.out.println("Stadium name:" + stadium.name);
		System.out.println("Stadium location:" + stadium.location);
		System.out.println("Created the Stadium..");
	}
	static void getStadium(String name){
		System.out.println("Creating stadium with parameters");
		Stadium stadium = new Stadium(name);
		System.out.println("Stadium name:" + stadium.name);
		System.out.println("Created the Stadium");
	}
	static void getStadium(String name, String location){
		System.out.println("Creating stadium with parameters.");
		Stadium stadium = new Stadium(name, location);
		System.out.println("Stadium name:" + stadium.name);
		System.out.println("Stadium Location:" + stadium.location);
		System.out.println("Created the stadium");
	}
}