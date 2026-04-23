class FarmerStore{
	

Farmer[] farmers;
	int currentIndex = 0;
	
	
	FarmerStore(Farmer[] farmers){
		
		
		this.farmers = farmers;
	}
	  void saveFarmerStore(Farmer farmer){
		System.out.println("Executing saveFarmerStore in FarmerStore..");
		if(this.farmers != null && farmer != null){
			
			System.out.println("Array and name is not null..");
			int index = this.farmers.length-1;
			if(currentIndex <= index){
				this.farmers[currentIndex] = farmer;
				System.out.println(farmer);
				System.out.println("farmer is saving into the currentIndex...." + currentIndex);
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