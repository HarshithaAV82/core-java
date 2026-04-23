class Carpenter{
	
	String[] names;
	Wood[] woods;
	
	
	Carpenter(String[] names, Wood[] woods){
		this.names=names;
		this.woods=woods;
	}
	void display(){
		
		System.out.println("Carpenter Information..");
		
		if(this.names != null){
			System.out.println("Carpenter name:" + this.name.length);
			
			for(String name : this.names){
				System.out.println("Name:" + name);
			}
		}
		
		if(this.woods != null){
			System.out.println("Total woods:" + this.woods.length);
			for(Wood wood : this.woods){
				System.out.println("Wood Type:" + wood.type);
				System.out.println("Price:" + wood.price);
			}
		}
		
	}
}