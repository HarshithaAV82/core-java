class BitShift{
	
	
	public static void main(String[] args){
		
		int num = 8;
		
	System.out.println("Original number: " + num);
	
	
	int leftShift = num << 1;
	System.out.println("After Left Shift (num << 1): " + leftShift);
	
	int rightShift = num >> 1;
	System.out.println("After Right Shift(num >> 1):" + rightShift);
	
	
	int unsignedRight = num >>> 1;
	System.out.println("After unsigned Right Shift(num >>>1):"  + unsignedRight);
		
		
	}
}