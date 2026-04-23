class Person
{
	static void contactInfo(String name,String[] emails,long[] mobileNumbers,String address)
	{
		System.out.println("Person name : "+name);
		for(int index=0;index<emails.length;index++)
		{
			System.out.println("Email:"+emails[index]);
		}
		for(int i=0;i<mobileNumbers.length;i++)
		{
			System.out.println("Mobile Number:"+mobileNumbers[i]);
		}
		System.out.println("Person address : "+address);
		
		if(name==null)
		{
			System.out.println("Person name is invalid...");
			return;
		}
		
		if(address==null)
		{
			System.out.println("Person address is invalid...");
			return;
		}
		System.out.println("Person info is valid...");
	}
	
	static void foodDish(String name,String[] ingredients)
	{
		System.out.println("Dish name : "+name);
		for(int index=0;index<ingredients.length;index++)
		{
			System.out.println("Ingredients:"+ingredients[index]);
		}
		if(name==null)
		{
			System.out.println("Dish name is invalid...");
			return;
		}
		System.out.println("Dish info is valid...");
	}
	
	static void laptop(String brand,String model,String[] ports,String[] countriesOfWarranty)
	{
		System.out.println("Laptop Brand : "+brand);
		System.out.println("Laptop model : "+model);
		for(int index=0;index<ports.length;index++)
		{
			System.out.println("Ports:"+ports[index]);
		}
		for(int i=0;i<countriesOfWarranty.length;i++)
		{
			System.out.println("Countires:"+countriesOfWarranty[i]);
		}
		if(brand==null)
		{
			System.out.println("Laptop brand is invalid...");
			return;
		}
		if(model==null)
		{
			System.out.println("Laptop model is invalid...");
			return;
		}
		System.out.println("Laptop info is valid...");
	}
}