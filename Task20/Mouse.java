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
		
		System.out.println("Created Mouse with leftClick rightClick scrollDown drag model usinng const");
	}
	
	
}