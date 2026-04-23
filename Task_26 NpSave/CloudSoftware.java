class CloudSoftware{
	
	String name;
	String type;
	double price;
	double limit;
	boolean payasgo;
	boolean subscription;
	
		CloudSoftware(
	String name,
	String type,
	double price,
	double limit,
	boolean payasgo,
	boolean subscription){
		this.name=name;
		this.type=type;
		this.price=price;
		this.limit=limit;
		this.payasgo=payasgo;
		this.subscription=subscription;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in CloudSoftware...");
		System.out.println("name:" + this.name);
		System.out.println("type:" + this.type);
		System.out.println("price:" + this.price);
		System.out.println("limit:" + this.limit);
		System.out.println("payasgo:" + this.payasgo);
		System.out.println("subscription:" + this.subscription);
	}
	
}