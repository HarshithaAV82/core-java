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
	
	
	
   void getInfo(){
	   
	   if(this.acMotor != null){
		  this.acMotor.getMotor();
	   }else{
		   System.out.println(" AC Motor Info is not there...");
	   }
	   if(this.dcMotor != null){
		  this.dcMotor.getMotor();
	   }else{
		   System.out.println(" Dc Motor Info is not there...");
	   }
	   if(this.inductionMotor != null){
		  this.inductionMotor.getMotor();
	   }else{
		   System.out.println(" Induction Motor Info is not there...");
	   }if(this.electricMotor != null){
		  this.electricMotor.getMotor();
	   }else{
		   System.out.println("induction Motor Info is not there...");
	   }
	   if(this.hybridMotor != null){
		  this.hybridMotor.getMotor();
	   }else{
		   System.out.println("hybrid Motor Info is not there...");
	   }
   }
}