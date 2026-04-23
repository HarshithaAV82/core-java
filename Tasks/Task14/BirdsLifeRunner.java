class BirdsLifeRunner{

 public static void main(String[] args){
	 
	 String name = "HouseSparrow";
	 int lifespan = BirdsLife.getBirdsLifespanByName(name);
	 System.out.println("The bird name is:" + name);
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 name = "RockPigeon";
     lifespan = BirdsLife.getBirdsLifespanByName(name);
     System.out.println("The bird name is: " + name + " | The bird lifespan is: " + lifespan + "years");

	 
	 lifespan = BirdsLife.getBirdsLifespanByName("HouseCrow");
      System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("commonMyna");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("RockDove");
     System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("BarnSwallow");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("Blackbird");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("EuropeanRobin");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("Mallard");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("Bluejay");
     System.out.println("The bird lifespan is:" + lifespan + "years");	 
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("Bulbul");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("GreatTit");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("AsianKoel");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("IndianRoller");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("GreyHeron");
     System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("PurpleSunbird");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("LaughingDove");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("CommonKingfisher");
     System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("babbler");
	 System.out.println("The bird lifespan is:" + lifespan + "years");
	 
	 lifespan = BirdsLife.getBirdsLifespanByName("GreaterCoucal");
     System.out.println("The bird lifespan is:" + lifespan + "years");
 }
}