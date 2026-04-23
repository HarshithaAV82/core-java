class Necklace{

    String brand;
    String material;
    String color;
    double price;
    double weight;
    String length;
    boolean isAdjustable;
    String designType;
    String stoneType;
    int numberOfStones;
    String claspType;
    boolean isWaterproof;
    String gender;
    String occasion;
    String countryOfOrigin;
    int warrantyMonths;
    String finishType;
    boolean isHandmade;
    String modelNumber;
    int rating;

    Necklace(String brand, String material, String color,
             double price, double weight, String length,
             boolean isAdjustable, String designType,
             String stoneType, int numberOfStones,
             String claspType, boolean isWaterproof,
             String gender, String occasion,
             String countryOfOrigin, int warrantyMonths,
             String finishType, boolean isHandmade,
             String modelNumber, int rating) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.length = length;
        this.isAdjustable = isAdjustable;
        this.designType = designType;
        this.stoneType = stoneType;
        this.numberOfStones = numberOfStones;
        this.claspType = claspType;
        this.isWaterproof = isWaterproof;
        this.gender = gender;
        this.occasion = occasion;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyMonths = warrantyMonths;
        this.finishType = finishType;
        this.isHandmade = isHandmade;
        this.modelNumber = modelNumber;
        this.rating = rating;
    }
}