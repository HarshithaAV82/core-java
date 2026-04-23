class SambarStore{
	

Sambar[] sambars;
	int currentIndex = 0;
	
	
	SambarStore(Sambar[] sambars){
		
		
		this. sambars= sambars;
	}
	  void saveSambarStore(Sambar sambar){
		System.out.println("Executing saveSambarStore in SambarStore..");
		if(this.sambars != null && sambar!= null){
			
			System.out.println("Array and name is not null..");
			int index = this.sambars.length-1;
			if(currentIndex <= index){
				this.sambars[currentIndex] =sambar;
				System.out.println(sambar);
				System.out.println("Sambar is saving into the currentIndex...." + currentIndex);
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