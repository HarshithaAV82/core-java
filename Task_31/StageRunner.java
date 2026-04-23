class StageRunner{
	
	
	public static void main(String[] args){
		
		
		Performance performance = new Performance();
		System.out.println(performance.stageType);
		System.out.println(performance.stageHeight);
		System.out.println(performance.isIndoor);
		
		
		Performance performance1 = new Performance("Conventionhall");
		System.out.println(performance1.stageType);
		System.out.println(performance1.stageHeight);
		System.out.println(performance1.isIndoor);
		
		Performance performance2 = new Performance(5.6, false);
		System.out.println(performance2.stageType);
		System.out.println(performance2.stageHeight);
		System.out.println(performance2.isIndoor);
		
		Performance performance3 = new Performance("schoolstage", 4.5, true);
		System.out.println(performance3.stageType);
		System.out.println(performance3.stageHeight);
		System.out.println(performance3.isIndoor);
	}
	
}