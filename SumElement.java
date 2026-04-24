class SumElement{
	
	public static void main(String[] args){
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int result = getElement(numbers);
		System.out.println(result);
	}
	static int getElement(int[] arr){
		int sum = 0;
		for(int num : arr){
			sum = sum + num;  // sum += num;
		}
		return sum;
	}
}