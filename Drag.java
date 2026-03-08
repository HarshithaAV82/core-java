class Drag{
	
	String select;
	String hold;
	
	
	
	Drag(String select, String hold){
		
		this.select=select;
		this.hold=hold;
	}
	
	void getDetails(){
		
		System.out.println("Drag Info , select:" +this.select + " , hold:" + this.hold);
		
	}
}
