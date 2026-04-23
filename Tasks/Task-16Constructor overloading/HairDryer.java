class HairDryer{

    String brand;
    String color;
    double price;
    int power;
    boolean isPortable;

    HairDryer(String brand, String color, double price, int power, boolean isPortable){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.power = power;
        this.isPortable = isPortable;
    }

    HairDryer(String brand){
        this.brand = brand;
    }

    HairDryer(String color, double price){
        this.color = color;
        this.price = price;
    }

    HairDryer(int power, boolean isPortable){
        this.power = power;
        this.isPortable = isPortable;
    }

    HairDryer(String color, double price, int power){
        this.color = color;
        this.price = price;
        this.power = power;
    }

    HairDryer(){
    }
}