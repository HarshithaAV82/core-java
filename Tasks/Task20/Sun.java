class Sun{
  
	int heat;
	boolean bright;
	
	Sun(int heat, boolean bright){
		this.heat = heat;
		this.bright = bright;
	}
	
	void getCloud(){
		System.out.println("Sun Heat: " + this.heat);
		System.out.println("Bright: " + this.bright);
	}
}