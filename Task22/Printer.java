class Printer{
	
	String[] models;
	Ink[] inks;
	
	Printer(String[] models, Ink[] inks){
		this.models=models;
		this.inks=inks;	
	}
	void display(){
		System.out.println("Printer Details..");
		if(this.models != null){
			System.out.println("Total Models:" +this.models.length);
			for(String model : this.models){
				System.out.println("Model name:" + model);
			}
		}
		if(this.inks != null){
			System.out.println("Total Ink types:" +this.inks.length);
			for(Ink ink : this.inks){
				System.out.println("Ink Color:" + ink.color);
				System.out.println("Ink Price:" + ink.price);
			}
		}
	}
}