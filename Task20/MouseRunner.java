class MouseRunner{
	
	public static void main(String[] args){
		
		LeftClick leftClick = new LeftClick(3, true);
		leftClick.getInfo();
		RightClick rightClick = new RightClick();
		ScrollDown  scrollDown = new ScrollDown();
		Drag drag = new Drag();
		Model model = new Model();
		
		Mouse mouse = new Mouse(5, leftClick, rightClick, scrollDown, drag, model);
		
		
	}
	
	
}