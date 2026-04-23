class MarineAnimal extends BlueWhale {

    MarineAnimal() {
        super(25, "Female", true);
        System.out.println("In this method i have done implicit or default values....");
		System.out.println("running MarineAnimal const with no parameters ....");
    }

   
    MarineAnimal(int age) {
        super(age, "Male", false);
        System.out.println("In this method i have done explicit only for age... ");
	    System.out.println("running MarineAnimal const with having one parameters ....");
    }

    MarineAnimal(int age, String gender, boolean isMigrating) {
        super(age, gender, isMigrating);
        System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running MarineAnimal const with having three parameters ....");
    }
}