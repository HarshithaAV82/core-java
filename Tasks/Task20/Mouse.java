class Mouse{
	
	int count = 6;
	String color = "Black";
	double price = 500;
	boolean quality = true;
	boolean warranty = true;

	int noOfMouse;
	LeftClick leftClick;
	RightClick rightClick;
	ScrollDown scrollDown;
	Drag drag;
	Model model;
	
	
	Mouse(int noOfMouse, LeftClick leftClick, RightClick rightClick, ScrollDown scrollDown,
	Drag drag, Model model){
		
		this.noOfMouse=noOfMouse;
		this.leftClick=leftClick;
		this.rightClick=rightClick;
		this.scrollDown=scrollDown;
		this.drag=drag;
		this.model=model;
		
		System.out.println("Created Mouse with leftClick rightClick scrollDown drag model using const");
	}
	
	void getDetails(){
		
		System.out.println("Mouse details noOfMouse:" + this.noOfMouse);
		if(this.leftClick !=null){
			
			this.leftClick.getInfo();
		}else{
			System.out.println("LeftClick option is not there..");
		}
		if(this.rightClick != null){
			this.rightClick.getInfo();
		}else{
			System.out.println("RightClick option is not there..");
		}
		if(this.scrollDown !=null){
			
			this.scrollDown.getDisplay();
		}else{
			System.out.println("scrollDown option is not there..");
		}
		if(this.drag !=null){
			
			this.drag.getDetails();
		}else{
			System.out.println("drag option is not there..");
		}
		if(this.model !=null){
			
			this.model.getInfo();
		}else{
			System.out.println("model option is not there..");
		}
	}
}