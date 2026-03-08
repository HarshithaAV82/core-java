class SpaRunner{
	
	public static void main(String[] args){
		
		HealthCenter healthCenter = new HealthCenter("HeadMassage", 24);
		
		
		BeautyParlor beautyParlour = new BeautyParlor(1500, 4.6);
		
		
		MassageCenter massageCenter = new MassageCenter("Thai Massage", 2000);
		
		
		AyurvedicSpa ayurvedicSpa = new AyurvedicSpa("Herbal Therapy", 2500);
		
		
		Detox detox = new Detox(true, 1200);
	
		
		Spa spa = new Spa(healthCenter, beautyParlour, massageCenter, ayurvedicSpa, detox);
		spa.getSpaInfo();
		
	}
}