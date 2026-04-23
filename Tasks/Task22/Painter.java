class Painter{
	
	String[] painterNames;
	PaintColor[] paintColors;
	
	
	Painter(String[] painterNames, PaintColor[] paintColors){
		this.painterNames=painterNames;
		this.paintColors=paintColors;
	}
	void display(){
		
		System.out.println("Painter Information/...");
		
		if(this.painterNames != null){
			System.out.println("Total Painters:" + this.painterNames.length);
			
			for(String name: this.painterNames){
				System.out.println("Painter Name:" + name);
			}
		}
		if(this.paintColors != null){
			System.out.println("Total colors:" + this.paintColors.length);
			
			for(PaintColor color:this.paintColors){
				System.out.println("color:" + color.colorName);
				System.out.println("Price:" + color.price);
			}
		}
	}
}