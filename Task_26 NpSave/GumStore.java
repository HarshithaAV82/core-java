class GumStore{
	

Gum[] gums;
	int currentIndex = 0;
	
	
	GumStore(Gum[] gums){
		
		
		this.gums = gums;
	}
	  void saveGumStore(Gum gum){
		System.out.println("Executing saveGumStore in GumStore..");
		if(this.gums != null && gum != null){
			
			System.out.println("Array and name is not null..");
			int index = this.gums.length-1;
			if(currentIndex <= index){
				this.gums[currentIndex] = gum;
				System.out.println(gum);
				System.out.println("Gum is saving into the currentIndex...." + currentIndex);
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