class Lion{
	
	int age;
	double weight;
	boolean isHungry;
	int totalNoOfLions;
	String type;
	
	Animal animal;
	Carnivores carnivores;
	Forest forest;
	Roar roar;
	King king;
	
	Lion(Animal animal, Carnivores carnivores, Forest forest, Roar roar, King king){
		
		this.animal=animal;
		this.carnivores=carnivores;
		this.forest=forest;
		this.roar=roar;
		this.king=king;
		
		System.out.println("Created Lion with animal carnivores forest roar king using const..");
	}
	

}