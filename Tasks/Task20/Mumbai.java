class Mumbai{
	
	String code;
	boolean winsMatch;
	
	Mumbai(String code, boolean winsMatch){
		this.code=code;
		this.winsMatch=winsMatch;
	}
	
	void getMatch(){
		System.out.println("Mumbai Code: " + this.code);
		System.out.println("Wins Match: " + this.winsMatch);
	}
}