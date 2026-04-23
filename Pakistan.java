class Pakistan{
	
	String teamLeader;
	int noOfPlayers;
	
	Pakistan(String teamLeader, int noOfPlayers){
		this.teamLeader=teamLeader;
		this.noOfPlayers=noOfPlayers;
	}
	
	void getMatch(){
		System.out.println("Pakistan Team Leader: " + this.teamLeader);
		System.out.println("Pakistan Players: " + this.noOfPlayers);
	}
}