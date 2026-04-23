class Kingdom{
	
	static void save(boolean king,
	                 String name,
					 String kingdomName,
	                 String queenName,
					 String princessName,
					 int populationOfKingdom,
	                 String territory,
					 int yearOfBirth,
					 int yearOfDeath,
	                 int armySize,
					 int yearsRuled)
	{
	
      System.out.println("King:" + king);
      System.out.println("King Name :" + name);
      System.out.println("Kingdom Name:" + kingdomName);
	  System.out.println("Queen Name:" + queenName);
	  System.out.println("princessName:" +  princessName);
	  System.out.println("Population of Kingdom :" + populationOfKingdom);
	  System.out.println("Territory:" + territory);
	  System.out.println("Year Of Birth:" +  yearOfBirth);
	  System.out.println("Year of Death:" +  yearOfDeath);
	  System.out.println("Army Size:" + armySize);
	  System.out.println("Years Ruled:" + yearsRuled);
	  
	  if(king==false){
		  System.out.println("Data is invalid, Make King is there in Kingdom like true");
		  return;
	  }
	  if(name==null){
		  System.out.println("Data is invalid, Make a Kingdom Name is not null....");
		  return;
	  }
	  if(queenName==null){
		  System.out.println("Data is invalid, Make a Queen Name is not Null..");
		  return;
	  }
	  if(princessName==null){
		  System.out.println("Data is invalid, Princess Name Should not be null");
		  return;
	  }
	  if(populationOfKingdom <= 0){
		  System.out.println("Data is invalid, Population must be greater than 0");
		  return;
	  }
	  if(territory == null){
		  System.out.println("Data is invalid,Territory should not be null ");
		  return;
	  }
	  if(yearOfBirth <= 0){
		  System.out.println("Data is invalid, year of Birth is wrong");
		  return;
	  }
	  if(yearOfDeath < 0){
		  System.out.println("Data is invalid, year of death is wrong ");
		  return;
	  }
	  if(armySize <= 0){
		  System.out.println("Data is invalid, Army size must be greater than 0");
		  return;
	  }
	  if(yearsRuled <= 0){
		  System.out.println("Data is invalid, years ruled must be grater than 0");
		  return;
	  }
	  
	  System.out.println(" Kingdom Data is Valid");
	  	
	}

  static void saveArmy(int noOfSoldiers,
                     int noOfElephants,
					 int noOfHorses,
					 String type,
					 int noOfWeapons,
					 String commanderName,
					 boolean commanderMarried,
					 String commanderWifeName,
					 boolean commanderIsFather,
					 String commanderChildName,
					 int commanderExperience)
					 {
	  System.out.println("No of Soliders:" + noOfSoldiers);
      System.out.println("No of Elephants:" + noOfElephants);
      System.out.println("No of Horses:" + noOfHorses);
	  System.out.println("Type:" + type);
	  System.out.println("No of Weapons:" +  noOfWeapons);
	  System.out.println("Commander Name :" + commanderName);
	  System.out.println("Commander Married:" + commanderMarried);
	  System.out.println("Commander Wife Name:" +  commanderWifeName);
	  System.out.println("Commander is Father:" +  commanderIsFather);
	  System.out.println("Commander Child Name:" + commanderChildName);
	  System.out.println("Commander Experience:" + commanderExperience);		 
						 
    if (noOfSoldiers < 0) {
        System.out.println("Invalid data: Number of soldiers must be greater than 0");
        return;
    }
    if (noOfElephants < 0) {
        System.out.println("Invalid data: Number of elephants cannot be 0");
        return;
    }
    if (noOfHorses < 0) {
        System.out.println("Invalid data: Number of horses cannot be 0");
        return;
    }
    if (type == null) {
        System.out.println("Invalid data: Army type cannot be null");
        return;
    }
    if (noOfWeapons <= 0) {
        System.out.println("Invalid data: Number of weapons must be greater than 0");
        return;
    }
    if (commanderName == null) {
        System.out.println("Invalid data: Commander name cannot be null");
        return;
    }
    if (commanderMarried == true) {
    
	if (commanderWifeName == null) {
        System.out.println("Invalid data: Commander wife name is required");
        return;
    }
}

    if (commanderIsFather == true) {
    
	if (commanderChildName == null) {
        System.out.println("Invalid data: Commander child name is required");
        return;
    }
}

    if (commanderExperience <= 0) {
        System.out.println("Invalid data: Commander experience must be greater than 0");
        return;
    }				 
						 
						 
     System.out.println("Army data is valid");
			 						 
						 
 } 
    }
 