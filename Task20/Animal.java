class Animal{
	
	String type;
	int count;
	
	Animal(String type, int count){
		this.type=type;
		this.count=count;
	}
	
	void getAnimal(){
		
		System.out.println("Animal Type:" + this.type);
		System.out.println("Animal Count:" + this.count);
		
		System.out.println("Created Animal using const..");
	}
	
}