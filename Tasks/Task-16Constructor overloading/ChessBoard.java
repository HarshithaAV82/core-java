class ChessBoard{

    String material;
    String color;
    double price;
    int squares;
    boolean isFoldable;

    ChessBoard(String material, String color, double price, int squares, boolean isFoldable){
        this.material = material;
        this.color = color;
        this.price = price;
        this.squares = squares;
        this.isFoldable = isFoldable;
    }

    ChessBoard(String material){
        this.material = material;
    }

    ChessBoard(String color, double price){
        this.color = color;
        this.price = price;
    }

    ChessBoard(int squares, boolean isFoldable){
        this.squares = squares;
        this.isFoldable = isFoldable;
    }

    ChessBoard(String color, double price, int squares){
        this.color = color;
        this.price = price;
        this.squares = squares;
    }

    ChessBoard(){
    }
}