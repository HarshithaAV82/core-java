class BreadRunner {

    public static void main(String[] args) {

       
        Bread bread1 = new Bread();

        bread1.type = "Whole Wheat";
        bread1.shape = "Rectangle";
        bread1.price = 45;
        bread1.brand = "Britannia";
        bread1.weight = 400;
        bread1.outletNames = new String[]{"Dmart", "Reliance Fresh"};
        bread1.ingredients = new String[]{"Wheat", "Yeast", "Salt"};
        System.out.println(" Bread Type: " + bread1.type);
        System.out.println("Bread Shape: " + bread1.shape);
        System.out.println("Bread Price: " + bread1.price);
        System.out.println("Bread Brand: " + bread1.brand);

        System.out.println("Outlets:");
        for(int i = 0; i < bread1.outletNames.length; i++){
            System.out.println(bread1.outletNames[i]);
        }

        System.out.println("Ingredients:");
        for(int i = 0; i < bread1.ingredients.length; i++){
            System.out.println(bread1.ingredients[i]);
        }


        Bread bread2 = new Bread();

        bread2.type = "Brown Bread";
        bread2.shape = "Square";
        bread2.price = 50;
        bread2.brand = "Harvest Gold";
        bread2.weight = 450;
        bread2.outletNames = new String[]{"More", "Big Bazaar"};
        bread2.ingredients = new String[]{"Maida", "Sugar", "Salt", "Yeast"};
        System.out.println("Type: " + bread2.type);
        System.out.println("Shape: " + bread2.shape);
        System.out.println("Price: " + bread2.price);
        System.out.println("Brand: " + bread2.brand);

        System.out.println("Outlets:");
        for(int i = 0; i < bread2.outletNames.length; i++){
            System.out.println(bread2.outletNames[i]);
        }

        System.out.println("Ingredients:");
        for(int i = 0; i < bread2.ingredients.length; i++){
            System.out.println(bread2.ingredients[i]);
        }
    }
}