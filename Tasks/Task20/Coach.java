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
	
		
	void getCoachInfo(){
		
		if(this.bootCamp != null){
			this.bootCamp.getCoach();
		}else{
			System.out.println("BootCamp is null");
		}
		
		if(this.academy != null){
			this.academy.getCoach();
		}else{
			System.out.println("Academy is null");
		}
		
		if(this.workShop != null){
			this.workShop.getCoach();
		}else{
			System.out.println("Workshop is null");
		}
		
		if(this.lab != null){
			this.lab.getCoach();
		}else{
			System.out.println("Lab is null");
		}
		
		if(this.training != null){
			this.training.getCoach();
		}else{
			System.out.println("Training is null");
		}
	}
}