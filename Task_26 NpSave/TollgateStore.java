class TollgateStore{
	

    Tollgate[] tollgates;
	int currentIndex = 0;
	
	
	TollgateStore(Tollgate[] tollgates){
		
		
		this.tollgates = tollgates;
	}
	  void saveTollgateStore(Tollgate  tollgate){
		System.out.println("Executing saveTollgateStore in TollgateStore..");
		if(this.tollgates != null && tollgate != null){
			
			System.out.println("Array and name is not null..");
			int index = this.tollgates.length-1;
			if(currentIndex <= index){
				this.tollgates[currentIndex] = tollgate;
				System.out.println(tollgate);
				System.out.println("tollgate is saving into the currentIndex...." + currentIndex);
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