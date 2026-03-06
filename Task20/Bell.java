class Bell{
	
	String name = "SchoolBell";
	String material = "Iron metal";
	double size = 2.3;
	double price = 500;
	boolean sound = true;
	
	SchoolBell schoolBell;
	CollegeBell collegeBell;
	HostelBell hostelBell;
	LunchBell lunchBell;
	DinnerBell dinnerBell;
	
	Bell(SchoolBell schoolBell, CollegeBell collegeBell, HostelBell hostelBell, LunchBell lunchBell, DinnerBell dinnerBell){
		
		this.schoolBell=schoolBell;
		this.collegeBell=collegeBell;
		this.hostelBell=hostelBell;
		this.lunchBell=lunchBell;
		this.dinnerBell=dinnerBell;
		
		System.out.println("Created the BEll using schoolBell collegeBell hostelBell lunchBell dinnerBell with constructor...");
	}
	
	
	
	
}