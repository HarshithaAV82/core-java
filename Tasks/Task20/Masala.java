class Masala{
	
	String type;
	boolean required;
	
	Masala(String type, boolean required){
		this.type = type;
		this.required = required;
	}
	
	void getTea(){
		System.out.println("Masala Type: " + this.type);
		System.out.println("Required: " + this.required);
	}
}