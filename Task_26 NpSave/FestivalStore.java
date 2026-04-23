class FestivalStore{
	
	
	Festival[] festivals;
	int currentIndex = 0;
	
	
	FestivalStore(Festival[] festivals){
		
		
		this.festivals = festivals;
	}
	  void saveFestivalStore(Festival festival){
		System.out.println("Executing storeFestivalStore in FestivalStore..");
		if(this.festivals != null && festival != null){
			
			System.out.println("Array and name is not null..");
			int index = this.festivals.length-1;
			if(currentIndex <= index){
				this.festivals[currentIndex] = festival;
				System.out.println(festival);
				System.out.println("festival is saving into the currentIndex...." + currentIndex);
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