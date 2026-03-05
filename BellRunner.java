class BellRunner{
	
	
	
	public static void main(String[] args){
		
		SchoolBell schoolBell = new SchoolBell("vasavi", 2.4);
		schoolBell.getBell();
		CollegeBell collegeBell = new CollegeBell();
		HostelBell hostelBell = new HostelBell();
		LunchBell lunchBell = new LunchBell();
		DinnerBell dinnerBell = new DinnerBell();
		
		Bell bell = new Bell(schoolBell, collegeBell, hostelBell, lunchBell, dinnerBell);
		
		
	}
}