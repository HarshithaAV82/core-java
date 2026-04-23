class DMart{
	
	int productsCount;
	Manager manager;
	Item item;
	
	DMart(int productsCount, Manager manager, Item item){
		this.productsCount=productsCount;
		this.manager=manager;
		this.item=item;
	}
	void printInfo(){
		
		System.out.println("Products Count:" + this.productsCount);
		if(manager != null){
			System.out.println("Manager:" + this.manager.name);
			
		}else{
			System.out.println("MAnager is not null...");
		}
		if(item!=null){
			
			System.out.println("item:" +this.item);
		}else{
			System.out.println("items is not null");
		}
	}
}