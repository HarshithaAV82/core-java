class PersonRunner
{
	public static void main(String[] args)
	{
		String name="Harshitha A V";
		String[] emails={"avharshitha607@gmail.com","avharshitha630@@gmail.com"};
		long[] mobileNumbers={8310935528L,7338594294L};
		String address="Hassan";
		
		Person.contactInfo(name,emails,mobileNumbers,address);
		
		String dish="Chitranna";
		String[] ingredients={"Rice","Oil","Coriander leaves" ,"Turmeric","Peanuts"};
		
		Person.foodDish(dish,ingredients);
		
		String laptop="DELL";
		String model="Inspiron 15";
		String[] ports={"HDMI","Type-C","USB"};
		String[] countries={"North Korea","America","European","New Zealand","Russia"};
		
		Person.laptop(laptop,model,ports,countries);
	}
	
}