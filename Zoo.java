class Zoo{
	
	
	String name;
	String location;
	
	
	Zoo(){
		
	}
	Zoo(String name){
		this.name=name;
		System.out.println("Zoo name is creating using String..");
	}
	Zoo(String name, String location){
		
		this.name=name;
		this.location=location;
		System.out.println("Zoo name and location is creating using String..");
	}
	
	
}