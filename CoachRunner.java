class CoachRunner{
	
	
	public static void main(String[] args){
		
		BootCamp bootCamp = new BootCamp("JavaFullStack", 4);
		bootCamp.getCoach();
		Academy academy = new Academy();
		WorkShop workShop = new WorkShop();
		Lab lab = new Lab();
		Training training = new Training();		
		
		Coach coach = new Coach(bootCamp, academy, workShop, lab, training);
	}
}