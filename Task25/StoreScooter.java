class StoreScooter{
	String[] scooterNames;
	int currentIndex;
	
	StoreScooter(String[] scooterNames)
	{
		this.scooterNames=scooterNames;
	}
	
	void getScooterName(String scooterName)
	{
		System.out.println("Executing the getScooterName in StoreScooter");
		System.out.println("Scooter name:"+scooterName);
		
		if(this.scooterNames!=null)
		{
			int index=this.scooterNames.length-1;
			System.out.println("Storing the scooterName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.scooterNames[currentIndex]=scooterName;
				System.out.println("Scooter name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another scooterName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Scooter array is full cannot store further");
			}
		}
		else{
			System.out.println("Scooter array is null");
		}
	}
	
	boolean searchScooterName(String scooterName)
	{
		if(scooterName!=null)
		{
			System.out.println("Searching for the "+scooterName+" in array");
			
			if(this.scooterNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.scooterNames)
				{
					if(name== scooterName)
					{
						System.out.println("Comparing "+name+" with "+scooterName);
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

