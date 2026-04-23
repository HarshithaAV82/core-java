class ChessBoard extends GameBoard {

    int numberOfPieces;
    boolean hasTimer;
    String colorType;
    boolean isFoldable;
    String difficultyLevel;

    ChessBoard() {
        super();
        System.out.println("ChessBoard constructor...");
    }

    void displayDetails() {
        System.out.println("executing displayDetails in ChessBoard...");
    }
}