class AcidStore{
	

Acid[] acids;
	int currentIndex = 0;
	
	
	AcidStore(Acid[] acids){
		
		
		this.acids = acids;
	}
	  void saveAcidStore(Acid acid){
		System.out.println("Executing saveAcidStore in AcidStore..");
		if(this.acids != null && acid!= null){
			
			System.out.println("Array and name is not null..");
			int index = this.acids.length-1;
			if(currentIndex <= index){
				this.acids[currentIndex] =acid;
				System.out.println(acid);
				System.out.println("Acid is saving into the currentIndex...." + currentIndex);
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