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
	
	void getInfo(){
		if(this.animal != null){
			this.animal.getAnimal();
		}else{
			System.out.println("Animal is not there...");
		}
		if(this.forest != null){
			this.forest.getAnimal();
		}else{
			System.out.println("Forset is not there...");
		}
		if(this.roar != null){
			this.roar.getAnimal();
		}else{
			System.out.println("Lion is not there...");
		}
		if(this.king != null){
			this.king.getAnimal();
		}else{
			System.out.println("king is not there...");
		}
		if(this.carnivores != null){
			this.carnivores.getAnimal();
		}else{
			System.out.println("carnivores is not there...");
		}
	}

}