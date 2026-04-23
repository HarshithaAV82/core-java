class MapRunner{
	
	
	public static void main(String[] args){
		
		Map map1 = new Map("Bangalore", "Southeast", true, true, "Arsikere", "bangalore");
		Map map2 = new Map("Mangalore", "Southwest", true, true, "Arsikere", "mangalore");
		Map map3 = new Map("Bijapur", "Northeast", true, true, "Arsikere", "bijapur");
		Map map4 = new Map("Mysore", "Southeast", true, true, "Arsikere", "mysore");
		Map map5 = new Map("Mandya", "Southeast", true, true, "Arsikere", "mandya");
		Map map6 = new Map("Southkorea", "Southeast", true, true, "bangalore", "southkorea");
		Map map7 = new Map("Himalaya", "North", true, true, "bangalore", "himalaya");
	    Map map8 = new Map("Bangalore", "Southeast", true, true, "Mysore", "bangalore");
		Map map9 = new Map("Bangalore", "Southeast", true, true, "Mandya", "bangalore");	
		Map map10 = new Map("Bangalore", "Southeast", true, true, "Chikkamaglur", "bangalore");	
        
		map1.getDetails();
		map2.getDetails();
		map3.getDetails();
		map4.getDetails();
		map5.getDetails();
		map6.getDetails();
		map7.getDetails();
		map8.getDetails();
		map9.getDetails();
		map10.getDetails();
		
		
		Map[] map = new Map[10];
		MapStore mapStore = new MapStore(map);
		mapStore.saveMapStore(map1);
		mapStore.saveMapStore(map2);
		mapStore.saveMapStore(map3);
		mapStore.saveMapStore(map4);
		mapStore.saveMapStore(map5);
		mapStore.saveMapStore(map6);
		mapStore.saveMapStore(map7);
		mapStore.saveMapStore(map8);
		mapStore.saveMapStore(map9);
		mapStore.saveMapStore(map10);
	
	}
	
}