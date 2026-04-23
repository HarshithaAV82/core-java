class ShoeLace{

    String brand;
    String color;
    double length;
    String material;
    double price;
    boolean isElastic;
    String pattern;
    String shoeType;
    String countryOfOrigin;
    int durabilityRating;

    ShoeLace(String brand, String color, double length,
             String material, double price, boolean isElastic,
             String pattern, String shoeType,
             String countryOfOrigin, int durabilityRating) {

        this.brand = brand;
        this.color = color;
        this.length = length;
        this.material = material;
        this.price = price;
        this.isElastic = isElastic;
        this.pattern = pattern;
        this.shoeType = shoeType;
        this.countryOfOrigin = countryOfOrigin;
        this.durabilityRating = durabilityRating;
    }
}