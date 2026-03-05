class AquariumRunner{
	
	
	
	public static void main(String[] args)
	{
		
		Fish fish = new Fish("Dolphin" , 33);
		fish.getAquarium();
        WaterLevel waterLevel = new WaterLevel();
        Plant plant = new Plant();
        Light light = new Light();
        Filter filter = new Filter();

        Aquarium aquarium = new Aquarium(fish, waterLevel, plant, light, filter);

		
	}
	
}