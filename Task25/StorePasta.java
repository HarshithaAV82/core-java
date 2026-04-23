class StorePasta{
	String[] pastaNames;
	int currentIndex;
	
	StorePasta(String[] pastaNames)
	{
		this.pastaNames=pastaNames;
	}
	
	void getPastaName(String pastaName)
	{
		System.out.println("Executing the getPastaName in StorePasta");
		System.out.println("Pasta name:"+pastaName);
		
		if(this.pastaNames!=null)
		{
			int index=this.pastaNames.length-1;
			System.out.println("Storing the pastaName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.pastaNames[currentIndex]=pastaName;
				System.out.println("Pasta name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another pastaName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Pasta array is full cannot store further");
			}
		}
		else{
			System.out.println("Pasta array is null");
		}
	}
	
	boolean searchPastaName(String pastaName)
	{
		if(pastaName!=null)
		{
			System.out.println("Searching for the "+pastaName+" in array");
			
			if(this.pastaNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.pastaNames)
				{
					if(name== pastaName)
					{
						System.out.println("Comparing "+name+" with "+pastaName);
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
