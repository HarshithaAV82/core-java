class Carrom{

    String brand;
    String material;
    double price;
    double size;
    boolean isFoldable;

    Carrom(String brand, String material, double price, double size, boolean isFoldable){
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.size = size;
        this.isFoldable = isFoldable;
    }

    Carrom(String brand){
        this.brand = brand;
    }

    Carrom(String material, double price){
        this.material = material;
        this.price = price;
    }

    Carrom(double size, boolean isFoldable){
        this.size = size;
        this.isFoldable = isFoldable;
    }

    Carrom(String material, double price, double size){
        this.material = material;
        this.price = price;
        this.size = size;
    }

    Carrom(){
    }
}