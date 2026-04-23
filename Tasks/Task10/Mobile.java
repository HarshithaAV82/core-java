class Mobile{

    
    static int getPrice(String model) {
        System.out.println("Mobile Model: " + model);
        if(model == null) {
            return 0;
        }

        if(model == "iPhone 14") {
            return 80000;
        }
        if(model == "Samsung Galaxy S23") {
            return 70000;
        }
        if(model == "OnePlus 11") {
            return 50000;
        }
        if(model == "Redmi Note 12") {
            return 15000;
        }

        return 0;
    }

 
    static String getBrand(String model) {
        if(model == null) {
            return "Unknown";
        }

        if(model == "iPhone 14") {
            return "Apple";
        }
        if(model == "Samsung Galaxy S23") {
            return "Samsung";
        }
        if(model == "OnePlus 11") {
            return "OnePlus";
        }
        if(model == "Redmi Note 12") {
            return "Xiaomi";
        }

        return "Unknown";
    }


    static String getOS(String model) {
        if(model == null) {
            return "Unknown";
        }

        if(model == "iPhone 14") {
            return "iOS";
        }
        if(model == "Samsung Galaxy S23") {
            return "Android";
        }
        if(model == "OnePlus 11") {
            return "Android";
        }
        if(model == "Redmi Note 12") {
            return "Android";
        }

        return "Unknown";
    }
}
