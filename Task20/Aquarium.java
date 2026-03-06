class Aquarium{

    int size = 50;
    boolean clean = true;
    double price = 1500.5;
    double waterQuanity = 5.5;
    int fishesCount = 10;

    Fish fish;
    WaterLevel waterLevel;
    Plant plant;
    Light light;
    Filter filter;
	
	
	Aquarium(Fish fish, WaterLevel waterLevel, Plant plant, Light light, Filter filter){
		
		this.fish=fish;
		this.waterLevel=waterLevel;
		this.plant=plant;
		this.light=light;
		this.filter=filter;
		
		
		System.out.println("Created Aquarium using fish water plant light filter with const,,..");
	}
}