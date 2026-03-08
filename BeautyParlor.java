class BeautyParlor{
	
	int price;
	double ratings;
	
	BeautyParlor(int price, double ratings){
		this.price = price;
		this.ratings = ratings;
	}
	
	void getSpa(){
		System.out.println("BeautyParlor Price: " + this.price);
		System.out.println("BeautyParlor Ratings: " + this.ratings);
	}
}