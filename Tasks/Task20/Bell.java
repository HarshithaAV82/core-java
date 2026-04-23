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
	void getBellInfo(){
		
		if(this.schoolBell != null){
			this.schoolBell.getBell();
		}else{
			System.out.println("SchoolBell is null");
		}
		
		if(this.collegeBell != null){
			this.collegeBell.getBell();
		}else{
			System.out.println("CollegeBell is null");
		}
		
		if(this.hostelBell != null){
			this.hostelBell.getBell();
		}else{
			System.out.println("HostelBell is null");
		}
		
		if(this.lunchBell != null){
			this.lunchBell.getBell();
		}else{
			System.out.println("LunchBell is null");
		}
		
		if(this.dinnerBell != null){
			this.dinnerBell.getBell();
		}else{
			System.out.println("DinnerBell is null");
		}
	}
	
	
	
}