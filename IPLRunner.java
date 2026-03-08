class IPLRunner{
	
	public static void main(String[] args){
		
		
		IndiaMatch indiaMatch = new IndiaMatch("Rahul", 9);
		CSK csk = new CSK(5, "Dhoni");
		England england = new England("England", 11);
		Pakistan pakistan = new Pakistan("Babar" , 11);
		Mumbai mumbai = new Mumbai("MI", true);
		
		IPL ipl = new IPL(indiaMatch, csk, england, pakistan, mumbai);
		ipl.getInfo();
		
	}
}