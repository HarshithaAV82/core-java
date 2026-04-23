class CloudRunner{
	
	public static void main(String[] args){
		
		Rain rain = new Rain(4, true);
		rain.getCloud();
        Wind wind = new Wind();
        Sun sun = new Sun();
        Sky sky = new Sky();
        Thunder thunder = new Thunder();

        Cloud cloud = new Cloud(rain, wind, sun, sky, thunder);
	}
}