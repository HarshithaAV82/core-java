class GenderStore{
	
	String[] genders;
	int currentIndex = 0;
	
	GenderStore(String[] genders){
		this.genders = genders;
	}
	
	void storeGender(String gender){
		if(this.genders!= null && gender != null){
			
			System.out.println("array and name is not null, so that we can store the names......");
			
			int index = this.genders.length-1;
			if(currentIndex <= index){
				
				this.genders[currentIndex] = gender;
				System.out.println("gender:" + gender);
				System.out.println("add the gender name into the genders of currentIndex....." + currentIndex);
				currentIndex++;
			
			
	}else{
		System.out.println("Array index is fulll,,,, so that we cannot add gender names...");
	}
      } else{
		System.out.println("array and name is full.....");
	}
	}
	void ascGender(){
		
		for(int i = 0; i < genders.length; i++){
			for(int j = i + 1; j < genders.length; j++){
				if(genders[i].compareTo(genders[j]) > 0){
					String temp = genders[i];
					genders[i] = genders[j];
					genders[j] = temp;
				} 
			}
		}
		
	}
	
	 void descGender(){
		 
		 for(int i = 0; i < genders.length; i++){
			 for(int j = i + 1; j < genders.length; j++){
				 
				 if(genders[i].compareTo(genders[j]) < 0){
					 String temp = genders[i];
					 genders[i] = genders[j];
					 genders[j] = temp;
				 }
			 }
		 }
	 }
	 
	 void display(){
		 
		 for(String gender : genders){
			 System.out.println(gender);
		 }
	 }
}