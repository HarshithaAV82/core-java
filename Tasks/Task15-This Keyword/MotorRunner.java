class MotorRunner{
	
	
	public static void main(String[] args){
		
		AcMotor acMotor = new AcMotor("fiber", 44.5);
		DcMotor dcMotor = new DcMotor();
		InductionMotor inductionMotor = new InductionMotor();
		ElectricMotor electricMotor = new ElectricMotor();
		HybridMotor hybridMotor = new HybridMotor();
		
		Motor motor = new Motor(acMotor, dcMotor, inductionMotor, electricMotor, hybridMotor);
	}
}