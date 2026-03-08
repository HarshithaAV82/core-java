class Water{
	
	String type;
	int level;
	
	Water(String type, int level){
		this.type = type;
		this.level = level;
	}
	
	void getTea(){
		System.out.println("Water Type: " + this.type);
		System.out.println("Water Level: " + this.level);
	}
}