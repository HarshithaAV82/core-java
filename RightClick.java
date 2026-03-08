class RightClick{
	
	int count;
	boolean rightClick;
	
	RightClick(int count, boolean rightClick){
		
		this.count=count;
		this.rightClick=rightClick;
	}
	
	void getInfo(){
		
		System.out.println("RightClick info, count:" + this.count + ", rightClick:"+this.rightClick);
		
	}
}