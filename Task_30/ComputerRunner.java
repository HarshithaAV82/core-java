class ComputerRunner{
	
	
	
	public static void main(String[] args){
		
		
		Browser browser = new Browser();
		ChromeBrowser chromeBrowser = new ChromeBrowser();
		MobileChromeBrowser mobileChromeBrowser = new MobileChromeBrowser();
		
		Computer computer = new Computer();
		computer.install(browser);
	}
}