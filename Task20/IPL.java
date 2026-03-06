class IPL{
	
    String location = "bangalore";
	int noOfMatches = 7;
	int noOfCoaches = 5;
	String teamLeader = "virat";
	int noOfWickets = 3;
	
	IndiaMatch indiaMatch;
	CSK csk;
	England england;
	Pakistan pakistan;
	Mumbai mumbai;
	
	IPL(IndiaMatch indiaMatch, CSK csk, England england, Pakistan pakistan, Mumbai mumbai){
		
		this.indiaMatch=indiaMatch;
		this.csk=csk;
		this.england=england;
		this.pakistan=pakistan;
		this.mumbai=mumbai;
		
		System.out.println("Created IPL matches using indiaMatch csk england pakistan mumbai");
	}
	
	
}