class Coach{
	
    String coachName = "BootCamp";
	int noOfStudents = 444;
	double price = 20000;
	double ratings = 4.5;
	boolean handsOnExperience = true;
	
	BootCamp bootCamp;
	Academy academy;
	WorkShop workShop;
	Lab lab;
	Training training;
	
	Coach(BootCamp bootCamp, Academy academy, WorkShop workShop, Lab lab, Training training){
		
		this.bootCamp=bootCamp;
		this.academy=academy;
		this.workShop=workShop;
		this.lab=lab;
		this.training=training;
		
		
		System.out.println("Created the Coach using bootCamp academy workShop lab training using const..");
	}
}