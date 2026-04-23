class WarRunner{
	
	
	public static void main(String[] args){
		
		
		Worldwar worldWar1 = new Worldwar();
        System.out.println(worldWar1.warName);
        System.out.println(worldWar1.noOfPeople);
        System.out.println(worldWar1.noOfdied);
        System.out.println(worldWar1.headName);
        System.out.println(worldWar1.location);
        System.out.println(worldWar1.noOfWeaponsUsed);
        System.out.println(worldWar1.warStarted);
        System.out.println(worldWar1.warStoped);
        worldWar1.worldOne();
        worldWar1.worldTwo();
        worldWar1.displayDetails();

        Worldwar worldWar2 = new Worldwar();
        System.out.println(worldWar2.warName);
        System.out.println(worldWar2.noOfPeople);
        System.out.println(worldWar2.noOfdied);
        System.out.println(worldWar2.headName);
        System.out.println(worldWar2.location);
        System.out.println(worldWar2.noOfWeaponsUsed);
        System.out.println(worldWar2.warStarted);
        System.out.println(worldWar2.warStoped);
        worldWar2.worldOne();
        worldWar2.worldTwo();
        worldWar2.displayDetails();

        War war1 = new Worldwar();
        System.out.println(war1.warName);
        System.out.println(war1.noOfPeople);
        System.out.println(war1.noOfdied);
        war1.worldOne();
        war1.worldTwo();
        
        
        War war2 = new Worldwar();
        System.out.println(war2.warName);
        System.out.println(war2.noOfPeople);
        System.out.println(war2.noOfdied);
        war2.worldOne();
        war2.worldTwo();
        

        War fight = new War();
        System.out.println(fight.warName);
        System.out.println(fight.noOfPeople);
        System.out.println(fight.noOfdied);
		fight.worldOne();
		fight.worldTwo();

        War fight1 = new War();
        System.out.println(fight1.warName);
        System.out.println(fight1.noOfPeople);
        System.out.println(fight1.noOfdied);
		fight1.worldOne();
		fight1.worldTwo();
	}
}