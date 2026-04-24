public class MissingNumber{
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,6};
		int n = 6;
		
		int result = n * (n + 1)/2;
		
		for(int num : arr){
			result -= num; 
		}
		System.out.println("missing element is:" + result + ";");
		
	}
}