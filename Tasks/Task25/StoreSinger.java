class StoreSinger{
	String[] singerNames;
	int currentIndex;
	
	StoreSinger(String[] singerNames)
	{
		this.singerNames=singerNames;
	}
	
	void getSingerName(String singerName)
	{
		System.out.println("Executing the getSingerName in StoreSinger");
		System.out.println("Singer name:"+singerName);
		
		if(this.singerNames!=null)
		{
			int index=this.singerNames.length-1;
			System.out.println("Storing the singerName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.singerNames[currentIndex]=singerName;
				System.out.println("Singer name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another singerName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Singer array is full cannot store further");
			}
		}
		else{
			System.out.println("Singer array is null");
		}
	}
	
	boolean searchSingerName(String singerName)
	{
		if(singerName!=null)
		{
			System.out.println("Searching for the "+singerName+" in array");
			
			if(this.singerNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.singerNames)
				{
					if(name== singerName)
					{
						System.out.println("Comparing "+name+" with "+singerName);
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
