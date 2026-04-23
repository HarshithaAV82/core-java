class ProfileStore{
	

Profile[] profiles;
	int currentIndex = 0;
	
	
	ProfileStore(Profile[] profiles){
		
		
		this.profiles = profiles;
	}
	  void saveProfileStore(Profile profile){
		System.out.println("Executing saveProfileStore in ProfileStore..");
		if(this.profiles != null && profile != null){
			
			System.out.println("Array and name is not null..");
			int index = this.profiles.length-1;
			if(currentIndex <= index){
				this.profiles[currentIndex] = profile;
				System.out.println(profile);
				System.out.println("profile is saving into the currentIndex...." + currentIndex);
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