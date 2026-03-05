class Cloud{
    
	
	int height = 2000;
	boolean dark = true;
	double speed = 15.5;
	boolean touch = false;
	int size = 5;
	
	
	Rain rain;
	Wind wind;
	Sun sun;
	Sky sky;
	Thunder thunder;
			
			

	Cloud(Rain rain, Wind wind, Sun sun, Sky sky, Thunder thunder){
		
		this.rain=rain;
		this.sun=sun;
		this.sky=sky;
		this.thunder=thunder;
		
		
		System.out.println("Created Cloud  using rain wind sun sky thunder with const..");
	}
}

