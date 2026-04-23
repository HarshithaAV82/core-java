class StorePetroleum{
	String[] petroleumNames;
	int currentIndex;
	
	StorePetroleum(String[] petroleumNames)
	{
		this.petroleumNames=petroleumNames;
	}
	
	void getPetroleumName(String petroleumName)
	{
		System.out.println("Executing the getPetroleumName in StorePetroleum");
		System.out.println("Petroleum name:"+petroleumName);
		
		if(this.petroleumNames!=null)
		{
			int index=this.petroleumNames.length-1;
			System.out.println("Storing the petroleumName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.petroleumNames[currentIndex]=petroleumName;
				System.out.println("Petroleum name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another petroleumName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Petroleum array is full cannot store further");
			}
		}
		else{
			System.out.println("Petroleum array is null");
		}
	}
	
	boolean searchPetroleumName(String petroleumName)
	{
		if(petroleumName!=null)
		{
			System.out.println("Searching for the "+petroleumName+" in array");
			
			if(this.petroleumNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.petroleumNames)
				{
					if(name== petroleumName)
					{
						System.out.println("Comparing "+name+" with "+petroleumName);
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