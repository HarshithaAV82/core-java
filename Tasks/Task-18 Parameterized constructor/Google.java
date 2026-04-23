class Google{
	
	String companyName;
	String founder1;
	String founder2;
	int    foundedYear;
	String headquarters;
	String ceo;
	long   employeesCount;
	double revenue;
	String mainProduct;
	String searchEngineName;
	boolean publicCompany;
	String  stockSymbol;
	String parentCompany;
	String emailServices;
	String cloudServices;
	String mobileOs;
	String videoPlatform;
	String browserName;
	String aiProduct;
	int    officesCount;
	

    Google(String companyName,String founder1,String founder2,int foundedYear, 	String headquarters, String ceo, long  employeesCount, double revenue,	
	String mainProduct,String searchEngineName,boolean publicCompany, String  stockSymbol,String parentCompany,String emailServices,
	String cloudServices,String mobileOs,String videoPlatform, String browserName, String aiProduct,int  officesCount){
		
		this.companyName=companyName;
		this.founder1=founder1;
		this.founder2=founder2;
		this.foundedYear=foundedYear;
		this.headquarters=headquarters;
		this.ceo=ceo;
		this.employeesCount=employeesCount;
		this.revenue=revenue;
		this.mainProduct=mainProduct;
		this.searchEngineName=searchEngineName;
		this.publicCompany=publicCompany;
		this.stockSymbol=stockSymbol;
		this.parentCompany=parentCompany;
		this.emailServices=emailServices;
		this.cloudServices=cloudServices;
		this.mobileOs=mobileOs;
		this.videoPlatform=videoPlatform;
		this.browserName=browserName;
		this.aiProduct=aiProduct;
		this.officesCount=officesCount;
				
	}
	   void details(){
		
		System.out.println("The details of Google Company...");
		System.out.println("companyName:" +this.companyName);
		System.out.println("founder1:" +this.founder1);
		System.out.println("founder2:" +this.founder2);
		System.out.println("foundedYear:" + this.foundedYear);
		System.out.println("headquarters:" +this.headquarters);
		System.out.println("ceo:" + this.ceo);
		System.out.println("employeesCount:" + this.employeesCount);
		System.out.println("revenue:" + this.revenue);
		System.out.println("mainProduct:" +this.mainProduct);
		System.out.println("searchEngineName:" +this.searchEngineName);				
		System.out.println("publicCompany:" +this.publicCompany);
		System.out.println("stockSymbol:" + stockSymbol);
		System.out.println("parentCompany:" + parentCompany);
		System.out.println("emailServices:" + this.emailServices);
		System.out.println("cloudServices:" +this.cloudServices);
		System.out.println("mobileOs:" + this.mobileOs);
		System.out.println("videoPlatform:" + this.videoPlatform);
		System.out.println("browserName:" + this.browserName);
		System.out.println("aiProduct:" +this.aiProduct);
		System.out.println("officesCount:" + this.officesCount);

	}
	
}