class Pawn{

    String color;
    String material;
    double height;
    double weight;
    boolean isPromoted;

    Pawn(String color, String material, double height, double weight, boolean isPromoted){
        this.color = color;
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.isPromoted = isPromoted;
    }

    Pawn(String color){
        this.color = color;
    }

    Pawn(String material, double height){
        this.material = material;
        this.height = height;
    }

    Pawn(double weight, boolean isPromoted){
        this.weight = weight;
        this.isPromoted = isPromoted;
    }

    Pawn(String material, double height, double weight){
        this.material = material;
        this.height = height;
        this.weight = weight;
    }

    Pawn(){
    }
}