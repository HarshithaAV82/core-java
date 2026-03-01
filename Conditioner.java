class Conditioner{

    String brand;
    String hairType;
    String fragrance;
    String color;
    String ingredients;
    String packaging;
    String country;
    String usageType;
    String texture;
    String model;
    double price;
    double quantity;
    double phLevel;
    double rating;
    int shelfLife;
    int stock;
    int year;
    boolean organic;
    boolean crueltyFree;
    boolean chemicalFree;

    Conditioner(String brand, String hairType, String fragrance, String color,
                String ingredients, String packaging, String country,
                String usageType, String texture, String model,
                double price, double quantity, double phLevel, double rating,
                int shelfLife, int stock, int year,
                boolean organic, boolean crueltyFree, boolean chemicalFree) {

        this.brand = brand;
        this.hairType = hairType;
        this.fragrance = fragrance;
        this.color = color;
        this.ingredients = ingredients;
        this.packaging = packaging;
        this.country = country;
        this.usageType = usageType;
        this.texture = texture;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.phLevel = phLevel;
        this.rating = rating;
        this.shelfLife = shelfLife;
        this.stock = stock;
        this.year = year;
        this.organic = organic;
        this.crueltyFree = crueltyFree;
        this.chemicalFree = chemicalFree;
    }

    void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Packaging: " + packaging);
        System.out.println("Country: " + country);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Texture: " + texture);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Rating: " + rating);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Stock: " + stock);
        System.out.println("Year: " + year);
        System.out.println("Organic: " + organic);
        System.out.println("Cruelty Free: " + crueltyFree);
        System.out.println("Chemical Free: " + chemicalFree);

    }
}