class Clip{

    String material;
    String color;
    double price;
    double size;
    boolean isMetal;

    Clip(String material, String color, double price, double size, boolean isMetal){
        this.material = material;
        this.color = color;
        this.price = price;
        this.size = size;
        this.isMetal = isMetal;
    }

    Clip(String material){
        this.material = material;
    }

    Clip(String color, double price){
        this.color = color;
        this.price = price;
    }

    Clip(double size, boolean isMetal){
        this.size = size;
        this.isMetal = isMetal;
    }

    Clip(String color, double price, double size){
        this.color = color;
        this.price = price;
        this.size = size;
    }

    Clip(){
    }
}