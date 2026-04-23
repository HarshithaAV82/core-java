class MapStore{
	
	Map[] maps;
	int currentIndex;
	
	MapStore(Map[] maps){
		this.maps=maps;
	}
	
	void saveMapStore(Map map){
		System.out.println("Executing saveMapStore in MapStore...");
		if(this.maps != null && map != null){
			System.out.println("check array and name is not null..");
			int index = maps.length-1;
			if(currentIndex <= index){
				this.maps[currentIndex] = map;
				System.out.println(map);
				System.out.println("Names are saving into the currentIndex.." + currentIndex);
				currentIndex++;
			}
			else{
				System.out.println("Array Index is full..");
			}
		}else{
			System.out.println("Array and name is null....");
		}
		
	}
}