class IPLRunner{
	
	public static void main(String[] args){
		
		
		IndiaMatch indiaMatch = new IndiaMatch("Rahul", 9);
		indiaMatch.getMatch();
		CSK csk = new CSK();
		England england = new England();
		Pakistan pakistan = new Pakistan();
		Mumbai mumbai = new Mumbai();
		
		IPL ipl = new IPL(indiaMatch, csk, england, pakistan, mumbai);
		
		
	}
}