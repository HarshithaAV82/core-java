class StoreCylinder{
	
	String[] cylinderNames;
	int currentIndex;
	
	StoreCylinder(String[] cylinderNames)
	{
		this.cylinderNames=cylinderNames;
	}
	
	void getCylinderName(String cylinderName)
	{
		System.out.println("Executing the getCylinderName in StoreCylinder");
		System.out.println("Cylinder name:"+cylinderName);
		
		if(this.cylinderNames!=null)
		{
			int index=this.cylinderNames.length-1;
			System.out.println("Storing the cylinderName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.cylinderNames[currentIndex]=cylinderName;
				System.out.println("Cylinder name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another cylinderName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Cylinder array is full cannot store further");
			}
		}
		else{
			System.out.println("Cylinder array is null");
		}
	}
	
	boolean searchCylinderName(String cylinderName)
	{
		if(cylinderName!=null)
		{
			System.out.println("Searching for the "+cylinderName+" in array");
			
			if(this.cylinderNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.cylinderNames)
				{
					if(name== cylinderName)
					{
						System.out.println("Comparing "+name+" with "+cylinderName);
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