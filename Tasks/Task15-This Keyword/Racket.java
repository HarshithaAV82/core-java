class Racket {
    String brand;
    String sportType;
    String color;
    double weight;
    double price;
    String gripSize;
    String material;
    int length;
    boolean isStrung;
    String playerLevel;

    Racket(String brand, String sportType, String color,
           double weight, double price, String gripSize,
           String material, int length, boolean isStrung,
           String playerLevel) {

        this.brand = brand;
        this.sportType = sportType;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.gripSize = gripSize;
        this.material = material;
        this.length = length;
        this.isStrung = isStrung;
        this.playerLevel = playerLevel;
    }
}