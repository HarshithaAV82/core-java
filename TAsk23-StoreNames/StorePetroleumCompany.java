class StorePetroleumCompany{
	String[] companyNames;
	int index = 0;

	StorePetroleumCompany(String[] companyNames)
	{
		this.companyNames = companyNames;
	}

	void getCompanyName(String company)
	{
		System.out.println("Executing getCompanyName in StorePetroleumCompany");
		System.out.println("Company Name: " + company);

		if(companyNames != null)
		{
			int size = this.companyNames.length - 1;
			System.out.println("Maximum array size: " + size);

			if(this.index <= size)
			{
				this.companyNames[index] = company;
				System.out.println("Current index: " + this.index);
				this.index++;
				System.out.println("Company stored, next index: " + this.index);
			}
			else
			{
				System.out.println("Sorry, company storage is full");
			}
		}
		else
		{
			System.out.println("Company array should not be null");
		}
	}
}