class CollegeBell{
	
	String name;
	String material;
	
	CollegeBell(String name, String material){
		this.name = name;
		this.material = material;
	}
	
	void getBell(){
		System.out.println("CollegeBell Name: " + this.name);
		System.out.println("Material: " + this.material);
	}
}