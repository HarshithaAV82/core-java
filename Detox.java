class Detox{
	
	boolean results;
	int cost;
	
	Detox(boolean results, int cost){
		this.results = results;
		this.cost = cost;
	}
	
	void getSpa(){
		System.out.println("Detox Results: " + this.results);
		System.out.println("Detox Cost: " + this.cost);
	}
}