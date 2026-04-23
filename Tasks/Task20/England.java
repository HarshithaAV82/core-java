class England{
	
	String name;
	int noOfPlayers;
	
	England(String name, int noOfPlayers){
		
		this.name=name;
		this.noOfPlayers=noOfPlayers;
	}
	
	void getMatch(){
		System.out.println("England Name: " + this.name);
		System.out.println("England Players: " + this.noOfPlayers);
	}
}