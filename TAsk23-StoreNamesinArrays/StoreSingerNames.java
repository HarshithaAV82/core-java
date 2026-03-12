class StoreSingerNames{
	String[] singers;
	int index = 0;

	StoreSingerNames(String[] singers)
	{
		this.singers = singers;
	}

	void addSinger(String singer)
	{
		System.out.println("Executing addSinger in StoreSingerNames");
		System.out.println("Singer Name: " + singer);

		if(singers != null)
		{
			int size = this.singers.length - 1;
			System.out.println("Maximum size of array: " + size);

			if(this.index <= size)
			{
				this.singers[index] = singer;
				System.out.println("Current index: " + this.index);
				this.index++;
				System.out.println("Singer stored, next index: " + this.index);
			}
			else
			{
				System.out.println("Storage is full");
			}
		}
		else
		{
			System.out.println("Singer array should not be null");
		}
	}
}