class Stadium{
	
	String name;
	String location;
	
	Stadium(){
		System.out.println("Default constructor called..");
	}
	Stadium(String name){
		this.name=name;
		System.out.println("Creating the stadium name..");
	}
	
	Stadium(String name, String location){
		
	System.out.println("creating a Stadium..");
		this.name=name;
		this.location=location;
		System.out.println("Stadium is created using String const..");
		
	}
}