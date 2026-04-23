class ArmstrongNumber{
  
  public static void main(String[] args){
	  
	  int number = 153;
	  int originalNumber = number;
	  int sum = 0;
	  
	  while (number > 0){
		  int digit = number % 10;
		  
		  sum = sum + (digit * digit * digit);
		  
		  number = number / 10;
	  }
	  
	  if(sum == originalNumber){
		  System.out.println("Armstrong Number");
		  
	  }
	  
	  else{
		  System.out.println("Not an Armstrong Number");
	  }
  }

}