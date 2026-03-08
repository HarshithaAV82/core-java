class Sky{
  
	String color;
	boolean clear;
	
	Sky(String color, boolean clear){
		this.color = color;
		this.clear = clear;
	}
	
	void getCloud(){
		System.out.println("Sky Color: " + this.color);
		System.out.println("Clear: " + this.clear);
	}
}