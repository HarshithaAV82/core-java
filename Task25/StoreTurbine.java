class StoreTurbine{
	String[] turbineNames;
	int currentIndex;
	
	StoreTurbine(String[] turbineNames)
	{
		this.turbineNames=turbineNames;
	}
	
	void getTurbineName(String turbineName)
	{
		System.out.println("Executing the getTurbineName in StoreTurbine");
		System.out.println("Turbine name:"+turbineName);
		
		if(this.turbineNames!=null)
		{
			int index=this.turbineNames.length-1;
			System.out.println("Storing the turbineName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.turbineNames[currentIndex]=turbineName;
				System.out.println("Turbine name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another turbineName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Turbine array is full cannot store further");
			}
		}
		else{
			System.out.println("Turbine array is null");
		}
	}
	
	boolean searchTurbineName(String turbineName)
	{
		if(turbineName!=null)
		{
			System.out.println("Searching for the "+turbineName+" in array");
			
			if(this.turbineNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.turbineNames)
				{
					if(name== turbineName)
					{
						System.out.println("Comparing "+name+" with "+turbineName);
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

