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
	
	void getCloudInfo(){
		
		if(this.rain != null){
			this.rain.getCloud();
		}else{
			System.out.println("Rain is null");
		}
		
		if(this.wind != null){
			this.wind.getCloud();
		}else{
			System.out.println("Wind is null");
		}
		
		if(this.sun != null){
			this.sun.getCloud();
		}else{
			System.out.println("Sun is null");
		}
		
		if(this.sky != null){
			this.sky.getCloud();
		}else{
			System.out.println("Sky is null");
		}
		
		if(this.thunder != null){
			this.thunder.getCloud();
		}else{
			System.out.println("Thunder is null");
		}
	}
}

