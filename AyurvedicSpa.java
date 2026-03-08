class AyurvedicSpa{
	
	String type;
	int price;
	
	AyurvedicSpa(String type, int price){
		this.type = type;
		this.price = price;
	}
	
	void getSpa(){
		System.out.println("Ayurvedic Spa Type: " + this.type);
		System.out.println("Price: " + this.price);
	}
}