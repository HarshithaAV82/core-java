class Profile{
	
	String name;
	String location;
	String  followers;
	String following;
	boolean privateAccount;
	boolean available;
	
	Profile(String name,
	String location,
	String  followers,
	String following,
	boolean privateAccount,
	boolean available){
		this.name=name;
		this.location=location;
		this.followers=followers;
		this.following=following;
		this.privateAccount=privateAccount;
		this.available=available;
	}
	
	void displayInfo(){
		
		System.out.println("executing displayInfo in profile...");
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("followers:" + this.followers);
		System.out.println("following:" + this.following);
		System.out.println("privateAccount:" + this.privateAccount);
		System.out.println("available:" + this.available);
	}
}