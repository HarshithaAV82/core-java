class Strawberry{

    String color;
    String taste;
    double weight;
    double price;
    boolean isFresh;

    Strawberry(String color, String taste, double weight, double price, boolean isFresh){
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        this.price = price;
        this.isFresh = isFresh;
    }

    Strawberry(String color){
        this.color = color;
    }

    Strawberry(String taste, double weight){
        this.taste = taste;
        this.weight = weight;
    }

    Strawberry(double price, boolean isFresh){
        this.price = price;
        this.isFresh = isFresh;
    }

    Strawberry(String taste, double weight, double price){
        this.taste = taste;
        this.weight = weight;
        this.price = price;
    }

    Strawberry(){
    }
}