class Motor{
	
	String name = "AcMotor";
	String type = "metal";
	int count = 5;
	boolean warranty = true;
	double ratings = 4.4;
	
	
	AcMotor acMotor;
	DcMotor dcMotor;
	InductionMotor inductionMotor;
	ElectricMotor electricMotor;
	HybridMotor hybridMotor;
	
	Motor(AcMotor acMotor, DcMotor dcMotor, InductionMotor inductionMotor,
	ElectricMotor electricMotor, HybridMotor hybridMotor){
		this.acMotor=acMotor;
		this.dcMotor=dcMotor;
		this.inductionMotor=inductionMotor;
		this.electricMotor=electricMotor;
		this.hybridMotor=hybridMotor;
		
		
		System.out.println("created Motor using acMotor dcMotor inductionMotor electricMotor hybridMotor with const..");
	}
}