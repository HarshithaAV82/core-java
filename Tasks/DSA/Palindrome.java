class Palindrome{
	
	public static void main(String[] args){
		
		checkPalindrome(121);
		checkPalindrome(122);
	}
		
	static void checkPalindrome(int number){
		int originalNumber = number;
		int reverse = 0;
		
		while(number > 0){
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number/10;
		}
		if(originalNumber == reverse){
			System.out.println("True - It is a palindrome");
		}else{
			System.out.println("False - Not a palindrome");
		}
	}
	
}

