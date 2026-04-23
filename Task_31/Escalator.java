class Escalator  extends StairCase{
	
	Escalator(){
		
		super(6.6, 7, "Spiral");
		System.out.println("In this method i have done implicit or default values....");
		System.out.println("running Escalator const with no parameters ....");
	}
	
	Escalator(double stepWidth){
		
		super(stepWidth, 3, "round");
		System.out.println("In this method i have done explicit only for stepWidth... ");
	    System.out.println("running Escalator const with having one parameters ....");
	}
	
	Escalator(double stepWidth, int numberOfTurns, String stairShape){
		
		super(stepWidth, numberOfTurns, stairShape);
		System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running Escalator const with having three parameters ....");
	}
}