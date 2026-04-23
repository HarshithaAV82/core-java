class ZooCreator{
	
	static void getZoo(){
		System.out.println("Zoo is created with no parameters..");
		Zoo zoo = new Zoo();
		System.out.println("Zoo name:" + zoo.name);
		System.out.println("Zoo location:" + zoo.location);
		System.out.println("Zoo are created...");
	}
	static void getZoo(String name){
		System.out.println("Zoo is created with parameters..");
		Zoo zoo = new Zoo(name);
		System.out.println("Zoo name:" + zoo.name);
		System.out.println("zoo are created..");
	}
	static void getZoo(String name, String location){
		System.out.println("Zoo is created with parameters..");
		Zoo zoo = new Zoo(name, location);
		System.out.println("zoo name:" + zoo.name);
		System.out.println("Zoo location:" + zoo.location);
		System.out.println("Zoo are created..");
	}
	
}