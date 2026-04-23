class StoreTree{
	String[] treeNames;
	int currentIndex;
	
	StoreTree(String[] treeNames)
	{
		this.treeNames=treeNames;
	}
	
	void getTreeName(String treeName)
	{
		System.out.println("Executing the getTreeName in StoreTree");
		System.out.println("Tree name:"+treeName);
		
		if(this.treeNames!=null)
		{
			int index=this.treeNames.length-1;
			System.out.println("Storing the treeName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.treeNames[currentIndex]=treeName;
				System.out.println("Tree name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another treeName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Tree array is full cannot store further");
			}
		}
		else{
			System.out.println("Tree array is null");
		}
	}
	
	boolean searchTreeName(String treeName)
	{
		if(treeName!=null)
		{
			System.out.println("Searching for the "+treeName+" in array");
			
			if(this.treeNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.treeNames)
				{
					if(name== treeName)
					{
						System.out.println("Comparing "+name+" with "+treeName);
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
