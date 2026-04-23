class Shampoo{

    String brand;
    String type;
    String fragrance;
    String color;
    String hairType;
    String ingredients;
    String packagingType;
    String country;
    String model;
    String usage;
    double price;
    double quantity;
    double phLevel;
    double rating;
    int shelfLife;
    int stock;
    int manufactureYear;
    boolean herbal;
    boolean sulfateFree;
    boolean parabenFree;

    Shampoo(String brand, String type, String fragrance, String color,
            String hairType, String ingredients, String packagingType,
            String country, String model, String usage,
            double price, double quantity, double phLevel, double rating,
            int shelfLife, int stock, int manufactureYear,
            boolean herbal, boolean sulfateFree, boolean parabenFree) {

        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.color = color;
        this.hairType = hairType;
        this.ingredients = ingredients;
        this.packagingType = packagingType;
        this.country = country;
        this.model = model;
        this.usage = usage;
        this.price = price;
        this.quantity = quantity;
        this.phLevel = phLevel;
        this.rating = rating;
        this.shelfLife = shelfLife;
        this.stock = stock;
        this.manufactureYear = manufactureYear;
        this.herbal = herbal;
        this.sulfateFree = sulfateFree;
        this.parabenFree = parabenFree;
    }

    void printDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Country: " + country);
        System.out.println("Model: " + model);
        System.out.println("Usage: " + usage);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Rating: " + rating);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Stock: " + stock);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Herbal: " + herbal);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Paraben Free: " + parabenFree);

	}
}