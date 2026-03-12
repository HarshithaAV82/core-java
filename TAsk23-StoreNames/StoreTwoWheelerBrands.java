class StoreTwoWheelerBrands{
	String[] brands;
	int index = 0;

	StoreTwoWheelerBrands(String[] brands)
	{
		this.brands = brands;
	}

	void addBrand(String brand)
	{
		System.out.println("Executing addBrand in StoreTwoWheelerBrands");
		System.out.println("Brand Name: " + brand);

		if(brands != null)
		{
			int size = this.brands.length - 1;
			System.out.println("Maximum size of array: " + size);

			if(this.index <= size)
			{
				this.brands[index] = brand;
				System.out.println("Current index: " + this.index);
				this.index++;
				System.out.println("Brand stored, next index: " + this.index);
			}
			else
			{
				System.out.println("Sorry, brands storage is full");
			}
		}
		else
		{
			System.out.println("Brands array should not be null");
		}
	}
}