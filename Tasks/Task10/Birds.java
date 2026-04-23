class Birds{

  static String getColorByName(String name){
	  	 
	 System.out.println("executing getColorByName:" + name);
	  if(name==null){
		  System.out.println("The name is not null...");
		  return null;
	  }
	  if(name == "HouseSparrow"){
		  return "Brown";
	  }
	  if(name=="RockPigeon"){
		  return "Blue";
	  }
	  if(name=="HouseCrow"){
		  return "Black";
	  }
	  if(name=="commonMyna"){
		  return "Yellow";
	  }
	  if(name=="RockDove"){
		  return "Purple";
	  }
	  if(name=="BarnSwallow"){
		  return "Red";
	  }
	  if(name=="Blackbird"){
		  return "Black" ;
	  }
	  if(name=="EuropeanRobin"){
		  return "Brown" ;
	  }
	  if(name=="Mallard"){
		  return "White";
	  }
	  if(name== "Bluejay"){
		  return "Black" ;
	  }
	  if(name== "Bulbul"){
		  return "Red" ;
	  }
	  if(name== "GreatTit"){
		  return "Black" ;
	  }
	  if(name== "AsianKoel"){
		  return "White";
	  }
	  if(name== "IndianRoller"){
		  return "Black" ;
	  }
	  if(name== "GreyHeron"){
		  return "Grey";
	  }
	  if(name== "PurpleSunbird"){
		  return "black";
	  }
	  if(name== "LaughingDove"){
		  return "Pinkish Brown";
	  }
	  if(name== "CommonKingfisher"){
		  return "Blue";
	  }
	  if(name== "babbler"){
		  return "black";
	  }
	  if(name== "GreaterCoucal"){
		  return "Brown";
	  }
	  System.out.println("name not matching in Db");
	  return null;
  }

}