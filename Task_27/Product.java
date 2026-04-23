class Product{
	
	
	String name;
	String make;
	String mfgDate;
	double cost;
	ProductType productType;
	String seller;
	ProductWarranty productWarranty;
	String warrantyExpired;
	String uniqueId;
	String originCountry;
	
	
	Product(String name,
	String make,
	String mfgDate,
	double cost,
	ProductType productType,
	String seller,
	ProductWarranty productWarranty,
	String warrantyExpired,
	String uniqueId,
	String originCountry){
	
	
	this.name=name;
	this.make=make;
	this.mfgDate=mfgDate;
	this.cost=cost;
	this.productType=productType;
	this.seller=seller;
	this.productWarranty=productWarranty;
	this.warrantyExpired=warrantyExpired;
	this.uniqueId=uniqueId;
	this.originCountry=originCountry;
	}
	
	void displayInfo(){
		
		System.out.println("Executing displayInfo in product...");
		System.out.println("name:" + this.name);
		System.out.println("make:" + this.make);
		System.out.println("mfgDate:" + this.mfgDate);
		System.out.println("cost:" + this.cost);
		System.out.println("productType:" + this.productType);
		System.out.println("seller:" + this.seller);
		System.out.println("productWarranty:" + this.productWarranty);
		System.out.println("warrantyExpired:" + this.warrantyExpired);
		System.out.println("uniqueId:" + this.uniqueId);
		System.out.println("originCountry:" + this.originCountry);
		
	}
}