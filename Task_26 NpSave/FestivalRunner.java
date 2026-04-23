class FestivalRunner{
	
	
	
	public static void main(String[] args){
		
		Festival festival1 = new Festival("Sankrathi", "Hindhu", "1-13-2026", true, true, true);
		Festival festival2 = new Festival("Shivarati", "Hindhu", "2-18-2026", true, true, true);
		Festival festival3 = new Festival("Ugadi", "Hindhu", "3-19-2026", true, true, true);
		Festival festival4 = new Festival("Ramzan", "Muslim", "3-20-2026", true, true, true);
		Festival festival5 = new Festival("AyudaPooja", "Hindhu", "5-13-2026", true, true, true);
		Festival festival6 = new Festival("GoodFriday", "Chirstian", "1-27-2026", true, true, true);
		Festival festival7 = new Festival("Gowri ganesha", "Hindhu", "7-3-2026", true, true, true);
		Festival festival8 = new Festival("Deepawali", "Hindhu", "8-23-2026", true, true, true);
		Festival festival9 = new Festival("Mahalaya amavase", "Hindhu", "1-13-2026", true, true, true);
		Festival festival10 = new Festival("VijayaDashmi", "Hindhu", "6-17-2026", true, true, true);
		
		festival1.displayInfo();
		festival2.displayInfo();
		festival3.displayInfo();
		festival4.displayInfo();
		festival5.displayInfo();
		festival6.displayInfo();
		festival7.displayInfo();
		festival8.displayInfo();
		festival9.displayInfo();
		festival10.displayInfo();
		
		Festival[] festival = new Festival[10];
		FestivalStore festivalStore = new FestivalStore(festival);
		festivalStore.saveFestivalStore(festival1);
		festivalStore.saveFestivalStore(festival2);
		festivalStore.saveFestivalStore(festival3);
		festivalStore.saveFestivalStore(festival4);
		festivalStore.saveFestivalStore(festival5);
		festivalStore.saveFestivalStore(festival6);
		festivalStore.saveFestivalStore(festival7);
		festivalStore.saveFestivalStore(festival8);
		festivalStore.saveFestivalStore(festival9);
		festivalStore.saveFestivalStore(festival10);
		
	}
}