class AirConditionerRunner{

    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();

        airConditioner.brand = "LG";
        airConditioner.model = "DualCool";
        airConditioner.price = 42000;
        airConditioner.type = "Split";
        airConditioner.weight = 12.5;
        airConditioner.colors = new String[]{"White", "Silver"};
        airConditioner.warranty = true;
        airConditioner.working = true;
        System.out.println("Brand: " + airConditioner.brand);
        System.out.println("Model: " + airConditioner.model);
        System.out.println("Price: " + airConditioner.price);
        System.out.println("Colors:");
        for(int i = 0; i < airConditioner.colors.length; i++){
            System.out.println(airConditioner.colors[i]);
        }
	    System.out.println("warranty: " + airConditioner.warranty + "Years");
		System.out.println("working: " + airConditioner.working);

        AirConditioner airConditioner1 = new AirConditioner();

        airConditioner1.brand = "Blue Star";
        airConditioner1.model = "TurboCool Z";
        airConditioner1.price = 47000;
        airConditioner1.type = "Split";
        airConditioner1.weight = 13.8;
        airConditioner1.colors = new String[]{"White", "Rose Gold"};
        airConditioner1.warranty = true;
        airConditioner1.working = true;

        System.out.println("Brand: " + airConditioner1.brand);
        System.out.println("Model: " + airConditioner1.model);
        System.out.println("Price: " + airConditioner1.price);
        System.out.println("Type: " + airConditioner1.type);
        System.out.println("Weight: " + airConditioner1.weight);
        System.out.println("Colors:");
        for(int i = 0; i < airConditioner1.colors.length; i++){
            System.out.println(airConditioner1.colors[i]);
        }

        System.out.println("Warranty: " + airConditioner1.warranty + " Years");
        System.out.println("Working: " + airConditioner1.working);
 
    }
}