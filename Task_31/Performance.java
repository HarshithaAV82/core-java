class Performance extends Stage{
	
	Performance(){
		
		super("concert", 9.9, true);
		System.out.println("In this method i have done implicit or default values....");
		System.out.println("running Performance const with no parameters ....");
	}
	
	Performance(String stageType){
		super(stageType, 4.4, false);
		System.out.println("In this method i have done explicit only for stageType... ");
	    System.out.println("running Performance const with having one parameters ....");
	}
	
	Performance(double stageHeight, boolean isIndoor){
		
		super("stadium" ,stageHeight, isIndoor);
		System.out.println("In this method i have done explicit  for stageHeight, isIndoor... ");
	    System.out.println("running Performance const with having two parameters ....");
	}
	
	Performance(String stageType, double stageHeight, boolean isIndoor){
		
		super(stageType, stageHeight, isIndoor);
		System.out.println("In this method i have done explicit for stageType, stageHeight, isIndoor... ");
	    System.out.println("running Performance const with having three parameters ....");
	}
}