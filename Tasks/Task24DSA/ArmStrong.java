class ArmStrong{
	
	public static void main(String[] args){
		
		int num = 370;
		int original = num;
		int sum = 0;
		
		while(num > 0){
			
			int digit = num%10;
			sum = sum + (digit * digit *digit);
			num = num/10;
		}
		
		
		if(sum == original){
			System.out.println("ArmStrong");
		}else{
			System.out.println("not armstrong..");
		}
	}
}