class MotorRunner{
	
	
	public static void main(String[] args){
		
		AcMotor acMotor = new AcMotor("fiber", 44.5);
		DcMotor dcMotor = new DcMotor("DC Motor", 220);
		InductionMotor inductionMotor = new InductionMotor("Three Phase", true);
		ElectricMotor electricMotor = new ElectricMotor("Servo Motor", 1500);
		HybridMotor hybridMotor = new HybridMotor("Hybrid Drive Motor", 2.5);
		
		Motor motor = new Motor(acMotor, dcMotor, inductionMotor, electricMotor, hybridMotor);
		motor.getInfo();
	}
}