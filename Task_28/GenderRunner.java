class GenderRunner{
	
	public static void main(String[] args){
		
		
		String[] genders = new String[3];
		GenderStore genderStore = new GenderStore(genders);
		System.out.println("Storing the gender names...");
		genderStore.storeGender("Female");
		genderStore.storeGender("Male");
		genderStore.storeGender("Transgender");
		
		
		System.out.println("Ascending order:");
		genderStore.ascGender();
		genderStore.display();
		
		System.out.println("Descending order:");
		genderStore.descGender();
		genderStore.display();
	}
}