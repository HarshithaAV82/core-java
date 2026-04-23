class LeftClick{
	
	int count;
	boolean leftclick;
	
	LeftClick(int count, boolean leftclick){
		this.count=count;
		this.leftclick=leftclick;
	}
	void getInfo(){
		System.out.println("Count:" +this.count);
		System.out.println("leftclick:" + this.leftclick);
		
		System.out.println("Created LeftClick using const");
	}
}