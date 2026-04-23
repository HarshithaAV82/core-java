class ScrollDown{
	
	boolean scrollDown;
	boolean scrollUp;
	
	ScrollDown(boolean scrollDown, boolean scrollUp){
		this.scrollDown=scrollDown;
		this.scrollUp=scrollUp;
	}
	void getDisplay(){
		System.out.println("ScrollDown info, scrollDown:" +this.scrollDown + ", scrollUp:" +this.scrollUp);
	}
}