class ReverseString{
	
	public static void main(String[] args){
		String original="PROGRAM";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--){
			reversed=reversed+original.charAt(i);
		}
		System.out.println("Original String:"+original);
		System.out.println("Reversed String:"+reversed);
		
	}
}


//7-1 = 6 M
//6-1 = 5 A
//5-1 = 4 R
//4-1 = 3 G
//3-1 = 2 0
//2-1 = 1 R
//1-1 = 0 P

