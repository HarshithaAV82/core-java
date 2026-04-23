class ProfileRunner{
	
	
	public static void main(String... values){
		
		
		Profile profile1 = new Profile("Harshitha", "Bangalore", "1000", "500", true, true);
		Profile profile2 = new Profile("Hema", "Mysore", "100", "200", true, true);
		Profile profile3 = new Profile("Acchu", "Mangalore", "5000", "500", true, true);
		Profile profile4 = new Profile("Manasa", "ariskere", "600", "500", true, true);
		Profile profile5 = new Profile("Manu", "MAndya", "1000", "700", true, true);
		Profile profile6 = new Profile("Mamatha", "Bangalore", "1000", "800", true, true);
		Profile profile7 = new Profile("Meena", "Shimoga", "400", "900", true, true);
		Profile profile8 = new Profile("Monika", "Birur", "900", "500", true, true);
		Profile profile9 = new Profile("hamsika", "Bangalore", "300", "500", true, true);
		Profile profile10 = new Profile("Sahana", "Kadur", "1098", "899", true, true);
		
		profile1.displayInfo();
		profile2.displayInfo();
		profile3.displayInfo();
		profile4.displayInfo();
		profile5.displayInfo();
		profile6.displayInfo();
		profile7.displayInfo();
		profile8.displayInfo();
		profile9.displayInfo();
		profile10.displayInfo();
		
		
		Profile[] profile = new Profile[10];
		ProfileStore profileStore = new ProfileStore(profile);
		profileStore.saveProfileStore(profile1);
		profileStore.saveProfileStore(profile2);
		profileStore.saveProfileStore(profile3);
		profileStore.saveProfileStore(profile4);
		profileStore.saveProfileStore(profile5);
		profileStore.saveProfileStore(profile6);
		profileStore.saveProfileStore(profile7);
		profileStore.saveProfileStore(profile8);
		profileStore.saveProfileStore(profile9);
		profileStore.saveProfileStore(profile10);
		
	}
}