class King{
	
	String animal;
	String type;
	King(String animal, String type){
		this.animal=animal;
		this.type=type;
	}
	void getAnimal(){
		System.out.println("King Info animal:" + this.animal +", type:" + this.type);
	}
}