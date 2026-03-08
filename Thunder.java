class Thunder{
    
	String sound;
	int duration;
	
	Thunder(String sound, int duration){
		this.sound = sound;
		this.duration = duration;
	}
	
	void getCloud(){
		System.out.println("Thunder Sound: " + this.sound);
		System.out.println("Duration: " + this.duration);
	}
}