class BellRunner{
	
	public static void main(String[] args){
		
		SchoolBell schoolBell = new SchoolBell("Vasavi", 2.4);
		
		CollegeBell collegeBell = new CollegeBell("EngineeringBell", "Steel");
		
		HostelBell hostelBell = new HostelBell(true, 1.30);
		
		LunchBell lunchBell = new LunchBell("LunchTime", true);
		
		DinnerBell dinnerBell = new DinnerBell("DinnerTime", 8.00);
		
		Bell bell = new Bell(schoolBell, collegeBell, hostelBell, lunchBell, dinnerBell);
		
		bell.getBellInfo();
	}
}