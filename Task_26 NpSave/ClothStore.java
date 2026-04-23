class ClothStore{
	

Cloth[] cloths;
	int currentIndex = 0;
	
	
	ClothStore(Cloth[] cloths){
		
		
		this.cloths = cloths;
	}
	  void saveClothStore(Cloth cloth){
		System.out.println("Executing saveClothStore in clothStore..");
		if(this.cloths != null && cloth != null){
			
			System.out.println("Array and name is not null..");
			int index = this.cloths.length-1;
			if(currentIndex <= index){
				this.cloths[currentIndex] = cloth;
				System.out.println(cloth);
				System.out.println("cloth is saving into the currentIndex...." + currentIndex);
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