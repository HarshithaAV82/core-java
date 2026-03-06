class IndiaMatch{
	
	String teamLeader;
	int noOfPlayers;
	
	IndiaMatch(String teamLeader, int noOfPlayers){
		this.teamLeader=teamLeader;
		this.noOfPlayers=noOfPlayers;
	}
	
	void getMatch(){
		
		System.out.println("Team Leader:" + this.teamLeader);
		System.out.println("noOfPlayers:" + this.noOfPlayers);
		
		
		System.out.println("Created IndiaMatch using const..");
	}
	
	
	
}