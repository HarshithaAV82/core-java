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
		 
		System.out.println("Created Spa using healthCare beautyParlour massageCenter ayurvedicSpa detox");
	
	}
}