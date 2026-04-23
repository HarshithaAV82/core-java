class HappyDentRunner {

    public static void main(String[] args) {

        HappyDent happyDent1 = new HappyDent();

        happyDent1.name = "HappyDent White";
        happyDent1.flavor = "Mint";
        happyDent1.price = 10;
        happyDent1.weight = 5;
        happyDent1.brand = "Perfetti";
        happyDent1.color = "White";
        happyDent1.type = "Chewing Gum";
        happyDent1.sugarType = "Low Sugar";
        happyDent1.fresh = true;
        happyDent1.sugarFree = false;
        happyDent1.packaging = "Wrapper";
        happyDent1.manufacturer = "Perfetti India";
        happyDent1.country = "India";
        happyDent1.expiryDate = "12/2026";
        happyDent1.manufactureDate = "01/2025";
        happyDent1.size = "Small";
        happyDent1.texture = "Soft";
        happyDent1.aroma = "Strong Mint";
        happyDent1.category = "Confectionery";
        happyDent1.code = "HD1001";
        happyDent1.quantity = 20;
        happyDent1.rating = 5;
        happyDent1.batchNumber = "B123";
        happyDent1.available = true;
        happyDent1.shape = "Rectangle";
        happyDent1.targetAge = "Above 5";
        happyDent1.quality = "Premium";
        happyDent1.promotion = "Buy 1 Get 1";
        happyDent1.storageCondition = "Cool Place";
        happyDent1.safetyInfo = "Keep Away from Heat";

        happyDent1.ingredients = new String[]{"Sugar", "Mint", "Gum Base"};
        happyDent1.outlets = new String[]{"Dmart", "Reliance Fresh"};
        System.out.println("Name: " + happyDent1.name);
        System.out.println("Flavor: " + happyDent1.flavor);
        System.out.println("Price: " + happyDent1.price);
        System.out.println("Weight: " + happyDent1.weight);
        System.out.println("Brand: " + happyDent1.brand);
        System.out.println("Color: " + happyDent1.color);
        System.out.println("Type: " + happyDent1.type);
        System.out.println("Sugar Type: " + happyDent1.sugarType);
        System.out.println("Fresh: " + happyDent1.fresh);
        System.out.println("Sugar Free: " + happyDent1.sugarFree);
        System.out.println("Packaging: " + happyDent1.packaging);
        System.out.println("Manufacturer: " + happyDent1.manufacturer);
        System.out.println("Country: " + happyDent1.country);
        System.out.println("Expiry Date: " + happyDent1.expiryDate);
        System.out.println("Manufacture Date: " + happyDent1.manufactureDate);
        System.out.println("Size: " + happyDent1.size);
        System.out.println("Texture: " + happyDent1.texture);
        System.out.println("Aroma: " + happyDent1.aroma);
        System.out.println("Category: " + happyDent1.category);
        System.out.println("Code: " + happyDent1.code);
        System.out.println("Quantity: " + happyDent1.quantity);
        System.out.println("Rating: " + happyDent1.rating);
        System.out.println("Batch Number: " + happyDent1.batchNumber);
        System.out.println("Available: " + happyDent1.available);
        System.out.println("Shape: " + happyDent1.shape);
        System.out.println("Target Age: " + happyDent1.targetAge);
        System.out.println("Quality: " + happyDent1.quality);
        System.out.println("Promotion: " + happyDent1.promotion);
        System.out.println("Storage Condition: " + happyDent1.storageCondition);
        System.out.println("Safety Info: " + happyDent1.safetyInfo);

        System.out.println("Ingredients:");
        for(int i = 0; i < happyDent1.ingredients.length; i++){
            System.out.println(happyDent1.ingredients[i]);
        }

        System.out.println("Outlets:");
        for(int i = 0; i < happyDent1.outlets.length; i++){
            System.out.println(happyDent1.outlets[i]);
        }


        HappyDent happyDent2 = new HappyDent();

        happyDent2.name = "HappyDent Sparkle";
        happyDent2.flavor = "Peppermint";
        happyDent2.price = 15;
        happyDent2.weight = 6;
        happyDent2.brand = "Perfetti";
        happyDent2.color = "White";
        happyDent2.type = "Chewing Gum";
        happyDent2.sugarType = "Sugar Free";
        happyDent2.fresh = true;
        happyDent2.sugarFree = true;
        happyDent2.packaging = "Box";
        happyDent2.manufacturer = "Perfetti India";
        happyDent2.country = "India";
        happyDent2.expiryDate = "11/2026";
        happyDent2.manufactureDate = "02/2025";
        happyDent2.size = "Medium";
        happyDent2.texture = "Soft";
        happyDent2.aroma = "Peppermint";
        happyDent2.category = "Confectionery";
        happyDent2.code = "HD2002";
        happyDent2.quantity = 25;
        happyDent2.rating = 4;
        happyDent2.batchNumber = "B456";
        happyDent2.available = true;
        happyDent2.shape = "Square";
        happyDent2.targetAge = "Above 10";
        happyDent2.quality = "Standard";
        happyDent2.promotion = "Festival Offer";
        happyDent2.storageCondition = "Dry Place";
        happyDent2.safetyInfo = "Not for Small Kids";
        happyDent2.ingredients = new String[]{"Mint", "Gum Base", "Sweetener"};
        happyDent2.outlets = new String[]{"Big Bazaar", "More"};
        System.out.println("Name: " + happyDent2.name);
        System.out.println("Flavor: " + happyDent2.flavor);
        System.out.println("Price: " + happyDent2.price);
        System.out.println("Weight: " + happyDent2.weight);
        System.out.println("Brand: " + happyDent2.brand);
        System.out.println("Color: " + happyDent2.color);
        System.out.println("Type: " + happyDent2.type);
        System.out.println("Sugar Type: " + happyDent2.sugarType);
        System.out.println("Fresh: " + happyDent2.fresh);
        System.out.println("Sugar Free: " + happyDent2.sugarFree);
        System.out.println("Packaging: " + happyDent2.packaging);
        System.out.println("Manufacturer: " + happyDent2.manufacturer);
        System.out.println("Country: " + happyDent2.country);
        System.out.println("Expiry Date: " + happyDent2.expiryDate);
        System.out.println("Manufacture Date: " + happyDent2.manufactureDate);
        System.out.println("Size: " + happyDent2.size);
        System.out.println("Texture: " + happyDent2.texture);
        System.out.println("Aroma: " + happyDent2.aroma);
        System.out.println("Category: " + happyDent2.category);
        System.out.println("Code: " + happyDent2.code);
        System.out.println("Quantity: " + happyDent2.quantity);
        System.out.println("Rating: " + happyDent2.rating);
        System.out.println("Batch Number: " + happyDent2.batchNumber);
        System.out.println("Available: " + happyDent2.available);
        System.out.println("Shape: " + happyDent2.shape);
        System.out.println("Target Age: " + happyDent2.targetAge);
        System.out.println("Quality: " + happyDent2.quality);
        System.out.println("Promotion: " + happyDent2.promotion);
        System.out.println("Storage Condition: " + happyDent2.storageCondition);
        System.out.println("Safety Info: " + happyDent2.safetyInfo);

        System.out.println("Ingredients:");
        for(int i = 0; i < happyDent2.ingredients.length; i++){
            System.out.println(happyDent2.ingredients[i]);
        }

        System.out.println("Outlets:");
        for(int i = 0; i < happyDent2.outlets.length; i++){
            System.out.println(happyDent2.outlets[i]);
        }
    }
}