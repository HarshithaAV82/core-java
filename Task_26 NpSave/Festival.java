class Festival{
	
	
	String name;
	String religion;
	String date;
	boolean shoping;
	boolean holiday;
	boolean workship;
	
	Festival(String name,
	String religion,
	String date,
	boolean shoping,
	boolean holiday,
	boolean workship){
		
		this.name=name;
		this.religion=religion;
		this.date=date;
		this.shoping=shoping;
		this.holiday=holiday;
		this.workship=workship;
	}	
		void displayInfo(){
		System.out.println("Executing displayInfo in Festival...");
		System.out.println("name:" + this.name);
		System.out.println("religion:" + this.religion);
		System.out.println("date:" + this.date);
		System.out.println("shoping:" + shoping);
		System.out.println("workship:" + workship);
		
		}
}