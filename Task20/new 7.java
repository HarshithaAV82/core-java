class CloudRunner{
	
	public static void main(String[] args{
		
		Rain rain = new Rain(4, true);
        Wind wind = new Wind();
        Sun sun = new Sun();
        Sky sky = new Sky();
        Lightning lightning = new Lightning();

        Cloud cloud = new Cloud(rain, wind, sun, sky, lightning);
	}
}