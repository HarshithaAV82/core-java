class CapStore{
	
	Cap[] capStoreNames;
	int currentIndex = 0;
	
	
	
	
	CapStore(Cap[] capStoreNames){
		
		this.capStoreNames=capStoreNames;
	}
	
	void saveCapStore(Cap cap){
		
		System.out.println("Using Save method to store the CapStore name....");
		
		if(this.capStoreNames != null && cap != null){
			
			System.out.println("check whether the Array and name is not null , so it will proceed...");
			int index = this.capStoreNames.length-1;
			if(currentIndex <= index){
				this.capStoreNames[currentIndex] = cap;
				System.out.println(cap);
				System.out.println("cap are going to save into the currentIndex..." + currentIndex);
				currentIndex++;
			}
			else{
				System.out.println("Array Index is full...");
			}
		}else{
				System.out.println("Array and Names is null...");
			}
		}
	
	
	
	
	
	
	
}