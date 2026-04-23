class LeapYear{
	
	public static void main(String[] args){
		
		int year=2024;
		if(year % 400 == 0) {
			System.out.println(year + "is a Leap Year");
		}
		else if(year % 100 == 0){
			System.out.println(year + "is NOT a leap year");
		}
		else if(year % 4 == 0){
			System.out.println(year + "is a leap year");
		}
		else{
			System.out.println(year + "is NOT a leap year");
		
		}
	}
}