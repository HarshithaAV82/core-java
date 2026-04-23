class Pepper{
	
	String type;              
    String brand;
    String originCountry;
    String form;              
    double price;
    double weight;
    String packagingType;
    boolean organic;
    boolean glutenFree;
    boolean nonGMO;
    String flavorProfile;
    int spiceLevel;           
    String harvestYear;
    String expiryDate;
    String storageCondition;
    String color;
    double moistureContent;
    String grade;
    int stockAvailable;
    String certification;


  Pepper(String type,String brand,String originCountry,String form ,double price,double weight,
    String packagingType,boolean organic,boolean glutenFree,boolean nonGMO,String flavorProfile,
	int spiceLevel,String harvestYear,String expiryDate,String storageCondition,String color,
	double moistureContent,String grade, int stockAvailable, String certification){
	    
	  this.type=type;
	  this.brand=brand;
	  this.originCountry=originCountry;
	  this.form=form;
	  this.price=price;
	  this.weight=weight;
	  this.packagingType=packagingType;
	  this.organic=organic;
	  this.glutenFree=glutenFree;
	  this.nonGMO=nonGMO;
	  this.flavorProfile=flavorProfile;
	  this.spiceLevel=spiceLevel;
	  this.harvestYear=harvestYear;
	  this.expiryDate=expiryDate;
	  this.storageCondition=storageCondition;
	  this.color=color;
	  this.moistureContent=moistureContent;
	  this.grade=grade;
	  this.stockAvailable=stockAvailable;
	  this.certification=certification;
  }
  
  void displayInformation(){
	  
	  System.out.println("Display all the information of Pepper..");
	  System.out.println("Type :" + this.type);
	  System.out.println("brand :" + this.brand);
	  System.out.println("originCountry:"+ this.originCountry);
	  System.out.println("form :" + this.form);
	  System.out.println("price :" + this.price);
	  System.out.println("weight:"+  this.weight);
	  System.out.println("packagingType:" + this.packagingType);
	  System.out.println("organic:"+  this.organic);
	  System.out.println("glutenFree:" +this.glutenFree);
	  System.out.println("nonGMO:" +this.nonGMO);
	  System.out.println("flavorProfile :" + this.flavorProfile);
	  System.out.println("spiceLevel:" +  this.spiceLevel);
	  System.out.println("harvestYear:" + this.harvestYear);
	  System.out.println("expiryDate:" + this.expiryDate);
	  System.out.println("storageCondition:" +  this.storageCondition);
	  System.out.println("color :" +  this.color);
	  System.out.println("moistureContent:" +  this.moistureContent);
	  System.out.println("grade :" + this.grade);
	  System.out.println("stockAvailable :" + this.stockAvailable);
	  System.out.println("certification:" + this.certification);
  }
} 
 