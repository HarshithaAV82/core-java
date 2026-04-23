class FindElement{
	
	public static void main(String[] args){
		
		int[] arr = {30,40,500,44,77};
		boolean found = false;
		int key = 500;
		for(int i = 0 ;i < arr.length; i++){
			
			if(arr[i] == key){
			found = true;
			break;
			}
		}
		if(found){
			
			System.out.println("Element is found in the array.." + "key is:" +key);
		}else{
			System.out.println("Element is not found...");
		}
		
	}
}
