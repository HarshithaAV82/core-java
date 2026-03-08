class Forest{
	
	int forestcount;
	String animals;
	
	Forest(int forestcount, String animals){
		
		this.forestcount=forestcount;
		this.animals=animals;
	}
	void getAnimal(){
		System.out.println("Forest Info, forestcount:" + this.forestcount + ", animals:"+ this.animals);
	}
	
}