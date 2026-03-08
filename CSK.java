class CSK{
	
	int noOfWickets;
	String teamLeader;
	
	CSK(int noOfWickets, String teamLeader){
		
		this.noOfWickets=noOfWickets;
		this.teamLeader=teamLeader;
	}
	
	void getMatch(){
		System.out.println("CSK Team Leader: " + this.teamLeader);
		System.out.println("CSK Wickets: " + this.noOfWickets);
	}
}