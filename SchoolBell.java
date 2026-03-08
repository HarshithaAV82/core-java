class SchoolBell{
	
	String name;
	double time;
	
	SchoolBell(String name, double time){
		this.name = name;
		this.time = time;
	}
	
	void getBell(){
		System.out.println("SchoolBell Name: " + this.name);
		System.out.println("Time: " + this.time);
		System.out.println("Created SchoolBell using constructor");
	}
}