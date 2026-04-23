class SaltStore{
	

Salt[] salts;
	int currentIndex = 0;
	
	
	SaltStore(Salt[] salts){
		
		
		this. salts= salts;
	}
	  void saveSaltStore(Salt salt){
		System.out.println("Executing saveSaltStore in SaltStore..");
		if(this.salts != null && salt!= null){
			
			System.out.println("Array and name is not null..");
			int index = this.salts.length-1;
			if(currentIndex <= index){
				this.salts[currentIndex] =salt;
				System.out.println(salt);
				System.out.println("Salt is saving into the currentIndex...." + currentIndex);
				currentIndex++;
			}
			else{
				System.out.println("Array Index is full..");
			}
		}else{
			System.out.println("Arrays and name is null..");
		}
		}
	
}