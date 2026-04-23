class Biscuit {

    static int getCost(String name) {
        System.out.println("Biscuit Name: " + name);
        if(name == null) {
            System.out.println("Name is null");
            return 0;
        }
        System.out.println("Name is valid");

        if(name == "Parle-g") {
            return 10;
        }
        if(name == "Oreo") {
            return 10;
        }
        if(name == "Good Day") {
            return 30;
        }
        if(name == "Hide&Seek") {
            return 20;
        }

        return 0;
    }

    static String getShape(String name) {
        System.out.println("Biscuit Name: " + name);
        if(name == null) {
            return "Unknown";
        }

        if(name == "Parle-g") {
            return "Rectangular";
        }
        if(name == "Oreo") {
            return "Round";
        }
        if(name == "Good Day") {
            return "Square";
        }
        if(name == "Hide&Seek") {
            return "Round";
        }

        return "Unknown";
    }

   
    static String[] getFlavor(String name) {
        System.out.println("Biscuit Name: " + name);
        if(name == null) {
            return "Unknown";
        }

        if(name == "Parle-g") {
            return "Sweet";
        }
        if(name == "Oreo") {
            return "Chocolate";
        }
        if(name == "Good Day") {
            return "Butter";
        }
        if(name == "Hide&Seek") {
            return "Choco Chips";
        }

        return "Unknown";
    }
}
