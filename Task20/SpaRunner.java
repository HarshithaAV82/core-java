class SpaRunner{
	
	public static void main(String[] args){
		
		
		HealthCenter healthCenter = new HealthCenter("HeadMassage", 24);
		healthCenter.getSpa();
		BeautyParlor beautyParlour = new BeautyParlor();
		MassageCenter massageCenter = new MassageCenter();
		AyurvedicSpa ayurvedicSpa = new AyurvedicSpa();
		Detox detox = new Detox();
		
		Spa spa = new Spa(healthCenter, beautyParlour, massageCenter, ayurvedicSpa, detox);
		
	}
}