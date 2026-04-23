class StoreKettle{
	String[] kettleNames;
	int currentIndex;
	
	StoreKettle(String[] kettleNames)
	{
		this.kettleNames=kettleNames;
	}
	
	void getKettleName(String kettleName)
	{
		System.out.println("Executing the getKettleName in StoreKettle");
		System.out.println("Kettle name:"+kettleName);
		
		if(this.kettleNames!=null)
		{
			int index=this.kettleNames.length-1;
			System.out.println("Storing the kettleName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.kettleNames[currentIndex]=kettleName;
				System.out.println("Kettle name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another kettleName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Kettle array is full cannot store further");
			}
		}
		else{
			System.out.println("Kettle array is null");
		}
	}
	
	boolean searchKettleName(String kettleName)
	{
		if(kettleName!=null)
		{
			System.out.println("Searching for the "+kettleName+" in array");
			
			if(this.kettleNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.kettleNames)
				{
					if(name== kettleName)
					{
						System.out.println("Comparing "+name+" with "+kettleName);
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

