class DinnerBell{
	
	String dinnerName;
	double time;
	
	DinnerBell(String dinnerName, double time){
		this.dinnerName = dinnerName;
		this.time = time;
	}
	
	void getBell(){
		System.out.println("Dinner Name: " + this.dinnerName);
		System.out.println("Time: " + this.time);
	}
}
