class MouseRunner{
	
	public static void main(String[] args){
		
		LeftClick leftClick = new LeftClick(3, true);
		
		RightClick rightClick = new RightClick(4, true);
	
		ScrollDown  scrollDown = new ScrollDown(true, false);
	
		Drag drag = new Drag("select","hold");
		
		Model model = new Model("Dell", 899);
	
		
		Mouse mouse = new Mouse(5, leftClick, rightClick, scrollDown, null, model);
		mouse.getDetails();
		
		
	}
	
	
}