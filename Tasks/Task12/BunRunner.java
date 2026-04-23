class BunRunner{

    public static void main(String[] args) {

        Bun bun1 = new Bun();

        bun1.name = "Classic Bun";
        bun1.type = "Sweet";
        bun1.price = 20;
        bun1.weight = 80;
        bun1.brand = "Britannia";
        bun1.flavor = "Vanilla";
        bun1.fresh = true;
        bun1.quantity = 10;
        bun1.shape = "Round";
        bun1.size = "Medium";
        bun1.ingredients = new String[]{"Maida", "Sugar", "Milk"};
        bun1.stores = new String[]{"Dmart", "Reliance Fresh"};
        System.out.println("Name: " + bun1.name);
        System.out.println("Type: " + bun1.type);
        System.out.println("Price: " + bun1.price);
        System.out.println("Brand: " + bun1.brand);
        System.out.println("Fresh: " + bun1.fresh);
        System.out.println("Ingredients:");
        for(int i = 0; i < bun1.ingredients.length; i++){
            System.out.println(bun1.ingredients[i]);
        }
        System.out.println("Stores:");
        for(int i = 0; i < bun1.stores.length; i++){
            System.out.println(bun1.stores[i]);
        }

        Bun bun2 = new Bun();

        bun2.name = "Burger Bun";
        bun2.type = "Savory";
        bun2.price = 25;
        bun2.weight = 90;
        bun2.brand = "Harvest Gold";
        bun2.flavor = "Plain";
        bun2.fresh = false;
        bun2.quantity = 15;
        bun2.shape = "Round";
        bun2.size = "Large";
        bun2.ingredients = new String[]{"Wheat Flour", "Salt", "Yeast"};
        bun2.stores = new String[]{"More", "Big Bazaar"};
        System.out.println("Name: " + bun2.name);
        System.out.println("Type: " + bun2.type);
        System.out.println("Price: " + bun2.price);
        System.out.println("Brand: " + bun2.brand);
        System.out.println("Fresh: " + bun2.fresh);
        System.out.println("Ingredients:");
        for(int i = 0; i < bun2.ingredients.length; i++){
            System.out.println(bun2.ingredients[i]);
        }

        System.out.println("Stores:");
        for(int i = 0; i < bun2.stores.length; i++){
            System.out.println(bun2.stores[i]);
        }
    }
}