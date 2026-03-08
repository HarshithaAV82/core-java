class HostelBell{
	
	boolean lunch;
	double time;
	
	HostelBell(boolean lunch, double time){
		this.lunch = lunch;
		this.time = time;
	}
	
	void getBell(){
		System.out.println("Lunch Bell: " + this.lunch);
		System.out.println("Time: " + this.time);
	}
}