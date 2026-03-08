class Wind{
   
	int speed;
	String direction;
	
	Wind(int speed, String direction){
		this.speed = speed;
		this.direction = direction;
	}
	
	void getCloud(){
		System.out.println("Wind Speed: " + this.speed);
		System.out.println("Direction: " + this.direction);
	}
}