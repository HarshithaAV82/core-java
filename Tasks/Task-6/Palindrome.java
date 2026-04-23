class Palindrome{
	
	public static void main(String[]args){
		String original="LEVEL";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--){
			reversed=reversed+original.charAt(i);
		}
		if(original.equals(reversed)){
			System.out.println("is a Palindrome:"+original);
		}
		else{
			System.out.println("is not a Palindrome:"+original);
		}
	}
}

//5-1 = 4 L
//4-1 = 3 E
//3-1 = 2 V
//2-1 = 1 E
//1-1 = 0 L