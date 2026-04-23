class SaltRunner{
	
	
	public static void main(String... values){
		
		
		Salt salt1 = new Salt("Table Salt", 100, "white", true, true, true);
		Salt salt2 = new Salt("Himalyan pink", 500, "pink", true, true, true);
		Salt salt3 = new Salt("cooper sulphate", 1000, "Blue", true, true, true);
		Salt salt4 = new Salt("potassium", 800, "purple", true, true, true);
		Salt salt5 = new Salt("Nacl", 1000, "white", true, true, true);
		Salt salt6 = new Salt("sea salt", 5000, "clear", true, true, true);
		Salt salt7 = new Salt("salt", 900, "Pink", true, true, true);
		Salt salt8 = new Salt("anuporna", 500, "white", true, true, true);
		Salt salt9 = new Salt("nacl", 180, "white", true, true, true);
		Salt salt10 = new Salt("black salt", 300, "grey", true, true, true);
		
		
	   salt1.displayInfo();
		salt2.displayInfo();
	  salt3.displayInfo();
     salt4.displayInfo();
		salt5.displayInfo();
		salt6.displayInfo();
		salt7.displayInfo();
	  salt8.displayInfo();
		salt10.displayInfo();
		
		
		Salt[] salt = new Salt[10];
		SaltStore saltStore = new SaltStore(salt);
	    saltStore.saveSaltStore(salt1);
		saltStore.saveSaltStore(salt2);
		saltStore.saveSaltStore(salt3);
		saltStore.saveSaltStore(salt4);
		saltStore.saveSaltStore(salt5);
		saltStore.saveSaltStore(salt6);
		saltStore.saveSaltStore(salt7);
		saltStore.saveSaltStore(salt8);
		saltStore.saveSaltStore(salt9);
		saltStore.saveSaltStore(salt10);
		
	
	}
}