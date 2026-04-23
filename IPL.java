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
	void getInfo(){
		if(this.indiaMatch != null){
			this.indiaMatch.getMatch();
		}else{
			System.out.println("IndiaMatch not available");
		}
		
		if(this.csk != null){
			this.csk.getMatch();
		}else{
			System.out.println("CSK not available");
		}
		

		if(this.england != null){
			this.england.getMatch();
		}else{
			System.out.println("England not available");
		}
	
		
		if(this.pakistan != null){
			this.pakistan.getMatch();
		}else{
			System.out.println("Pakistan not available");
		}
	
		
		if(this.mumbai != null){
			this.mumbai.getMatch();
		}else{
			System.out.println("Mumbai not available");
		}
		
		
	}
}