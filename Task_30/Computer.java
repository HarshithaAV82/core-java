class  Computer{
	
	
	void install(Browser browser){
		
		System.out.println("Executing install method in computer....");
		
		if(browser != null){
			
			System.out.println("execute if not null......");
		}
		if(browser instanceof Browser){
			
			Browser brow = (Browser)browser;
			brow.open();
			}
		if(browser instanceof ChromeBrowser){
			
			ChromeBrowser chrome = (ChromeBrowser)browser;
			chrome.fastOpen();
		}
		if(browser instanceof MobileChromeBrowser){
			
			MobileChromeBrowser mobile = (MobileChromeBrowser)browser; 
			mobile.offline();
		}
	}
}