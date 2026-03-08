class CloudRunner{
	
	public static void main(String[] args){
		
		Rain rain = new Rain(4, true);
		
		Wind wind = new Wind(20, "East");
		
		Sun sun = new Sun(45, true);
		
		Sky sky = new Sky("Blue", true);
		
		Thunder thunder = new Thunder("Boom", 3);
		
		Cloud cloud = new Cloud(rain, wind, sun, sky, thunder);
		
		cloud.getCloudInfo();
	}
}