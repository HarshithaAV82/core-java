class StatueStore{
	

    Statue[] statues;
	int currentIndex = 0;
	
	
	StatueStore(Statue[] statues ){
		
		
		this.statues = statues;
	}
	  void saveStatueStore(Statue  statue){
		System.out.println("Executing saveStatueStore in StatueStore..");
		if(this.statues != null && statue != null){
			
			System.out.println("Array and name is not null..");
			int index = this.statues.length-1;
			if(currentIndex <= index){
				this.statues[currentIndex] = statue;
				System.out.println(statue);
				System.out.println("statue is saving into the currentIndex...." + currentIndex);
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