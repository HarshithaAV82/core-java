class StoreSteel{
	String[] steelNames;
	int currentIndex;
	
	StoreSteel(String[] steelNames)
	{
		this.steelNames=steelNames;
	}
	
	void getSteelName(String steelName)
	{
		System.out.println("Executing the getSteelName in StoreSteel");
		System.out.println("Steel name:"+steelName);
		
		if(this.steelNames!=null)
		{
			int index=this.steelNames.length-1;
			System.out.println("Storing the steelName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.steelNames[currentIndex]=steelName;
				System.out.println("Steel name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another steelName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Steel array is full cannot store further");
			}
		}
		else{
			System.out.println("Steel array is null");
		}
	}
	
	boolean searchSteelName(String steelName)
	{
		if(steelName!=null)
		{
			System.out.println("Searching for the "+steelName+" in array");
			
			if(this.steelNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.steelNames)
				{
					if(name== steelName)
					{
						System.out.println("Comparing "+name+" with "+steelName);
						return true;
					}
					else{
						System.out.println("Name not found in the array...");
						return false;
					}
				}		
			}
		}
		return false;
	}
}