class LunchBell{
	
	String lunchName;
	boolean sound;
	
	LunchBell(String lunchName, boolean sound){
		this.lunchName = lunchName;
		this.sound = sound;
	}
	
	void getBell(){
		System.out.println("Lunch Name: " + this.lunchName);
		System.out.println("Sound: " + this.sound);
	}
}