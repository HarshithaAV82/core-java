class FoodDelivery {

   
    static void order(String item) {
        if (item == null) {
            System.out.println("Item name cannot be empty");
            return;
        }

        System.out.println("Ordering: " + item);
        System.out.println("Order data is valid");
    }

   
    static void order(String item, int quantity) {
        if (item == null) {
            System.out.println("Item name cannot be empty");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0");
            return;
        }

        System.out.println("Ordering " + quantity + " " + item);
        System.out.println("Order data is valid");
    }

  
    static void order(String item, int quantity, boolean express) {
        if (item == null) {
            System.out.println("Item name cannot be empty");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0");
            return;
        }

        System.out.println("Ordering " + quantity + " " + item + "  Express: " + express);
        System.out.println("Order data is valid");
    }
}
