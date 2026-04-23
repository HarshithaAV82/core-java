class BirdsLife{

  static int getBirdsLifespanByName(String name){
	  
	  
	  System.out.println("executing getBirdsLifespanByName:" + name);
	  if(name==null){
		  System.out.println("The name is not null...");
		  return 0;
	  }
	  if(name == "HouseSparrow"){
		  return 3;
	  }
	  if(name=="RockPigeon"){
		  return 15;
	  }
	  if(name=="HouseCrow"){
		  return 20;
	  }
	  if(name=="commonMyna"){
		  return 12;
	  }
	  if(name=="RockDove"){
		  return 15;
	  }
	  if(name=="BarnSwallow"){
		  return 8;
	  }
	  if(name=="Blackbird"){
		  return 10 ;
	  }
	  if(name=="EuropeanRobin"){
		  return 5;
	  }
	  if(name=="Mallard"){
		  return 13;
	  }
	  if(name== "Bluejay"){
		  return 7 ;
	  }
	  if(name== "Bulbul"){
		  return 15;
	  }
	  if(name== "GreatTit"){
		  return 13;
	  }
	  if(name== "AsianKoel"){
		  return 10;
	  }
	  if(name== "IndianRoller"){
		  return 7;
	  }
	  if(name== "GreyHeron"){
		  return 15;
	  }
	  if(name== "PurpleSunbird"){
		  return 8;
	  }
	  if(name== "LaughingDove"){
		  return 12;
	  }
	  if(name== "CommonKingfisher"){
		  return 7;
	  }
	  if(name== "babbler"){
		  return 6;
	  }
	  if(name== "GreaterCoucal"){
		  return 	12;
	  }
	  System.out.println("name not matching in Db");
	  return 0;
	  
  }

}