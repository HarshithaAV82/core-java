class Fire{
	
	static int getSize(){
		System.out.println("Executing get Size in fire");
	     return 66;
		 }
	
	static String getcolor(){
		System.out.println("Executing getcolor in fire");
         return "Blue";		
		}
	
	static int getTemperature(){
		System.out.println("Executing getTemperature in fire");
		return 76;
	}
	
	static String getType(String type){
		System.out.println("Executing getType in fire");
		return "Smoke";
	}
	
	static boolean isSpreading(boolean spreading){
		System.out.println("Executing isSpreading in fire");
	     return true;
}
}