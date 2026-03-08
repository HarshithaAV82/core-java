class Spa{
	
    String name = "Glamours";
	String type = "HealthCare";
	double price = 800;
	boolean hygiene = true;
	double ratings = 4.5;
	
	
	HealthCenter healthCenter;
	BeautyParlor beautyParlor;
	MassageCenter massageCenter;
	AyurvedicSpa ayurvedicSpa;
	Detox detox;
	
	
	Spa(HealthCenter healthCenter, BeautyParlor beautyParlor, MassageCenter massageCenter, AyurvedicSpa ayurvedicSpa, Detox detox){

	     this.healthCenter=healthCenter;
		 this.beautyParlor=beautyParlor;
		 this.massageCenter=massageCenter;
		 this.ayurvedicSpa=ayurvedicSpa;
		 this.detox=detox;
		 
		System.out.println("Created Spa using healthCare beautyParlour massageCenter ayurvedicSpa detox");
	
	}
	
		void getSpaInfo(){
		
		if(this.healthCenter != null){
			this.healthCenter.getSpa();
		}else{
			System.out.println("HealthCenter is null");
		}
		
		if(this.beautyParlor != null){
			this.beautyParlor.getSpa();
		}else{
			System.out.println("BeautyParlor is null");
		}
		
		if(this.massageCenter != null){
			this.massageCenter.getSpa();
		}else{
			System.out.println("MassageCenter is null");
		}
		
		if(this.ayurvedicSpa != null){
			this.ayurvedicSpa.getSpa();
		}else{
			System.out.println("AyurvedicSpa is null");
		}
		
		if(this.detox != null){
			this.detox.getSpa();
		}else{
			System.out.println("Detox is null");
		}
	}
}
