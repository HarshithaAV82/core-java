class WordLength{
	
	public static void main(String[] args){
		
		String[] words = {"java", "Apple", "Cat", "Dog", "Egg"};
		
		for(int i = 0; i < words.length; i++){
			System.out.println("Word:" + words[i]);
			
			System.out.println("Length:" + words[i].length());
			
			if(words[i].length() > 4){
				System.out.println("Length > 4:" + words[i]);
			}		
			
		}
	}
}