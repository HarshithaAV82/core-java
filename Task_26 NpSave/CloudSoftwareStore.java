class CloudSoftwareStore{
	

    CloudSoftware[] cloudSoftwares;
	int currentIndex = 0;
	
	
	CloudSoftwareStore(CloudSoftware[] cloudSoftwares){
		
		this.cloudSoftwares = cloudSoftwares;
	}
	  void saveCloudSoftwareStore(CloudSoftware  cloudSoftware){
		System.out.println("Executing saveCloudSoftwareStore in CloudSoftwareStore..");
		if(this.cloudSoftwares != null && cloudSoftware != null){
			
			System.out.println("Array and name is not null..");
			int index = this.cloudSoftwares.length-1;
			if(currentIndex <= index){
				this.cloudSoftwares[currentIndex] = cloudSoftware;
				System.out.println(cloudSoftware);
				System.out.println("cloudSoftware is saving into the currentIndex...." + currentIndex);
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