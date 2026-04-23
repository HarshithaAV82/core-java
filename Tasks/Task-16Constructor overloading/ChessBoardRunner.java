class ChessBoardRunner{

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard("Wood", "Brown", 2999.0, 64, true);
        System.out.println("Material: " + chessBoard.material);
        System.out.println("Color: " + chessBoard.color);
        System.out.println("Price: " + chessBoard.price);
        System.out.println("Squares: " + chessBoard.squares);
        System.out.println("Is Foldable: " + chessBoard.isFoldable);

        ChessBoard chessBoard1 = new ChessBoard("Plastic");
        System.out.println("Material: " + chessBoard1.material);

        ChessBoard chessBoard2 = new ChessBoard("Black", 1999.0);
        System.out.println("Color: " + chessBoard2.color);
        System.out.println("Price: " + chessBoard2.price);

        ChessBoard chessBoard3 = new ChessBoard(64, false);
        System.out.println("Squares: " + chessBoard3.squares);
        System.out.println("Is Foldable: " + chessBoard3.isFoldable);

        ChessBoard chessBoard4 = new ChessBoard("White", 2499.0, 64);
        System.out.println("Color: " + chessBoard4.color);
        System.out.println("Price: " + chessBoard4.price);
        System.out.println("Squares: " + chessBoard4.squares);

        ChessBoard chessBoard5 = new ChessBoard();
        System.out.println("Material: " + chessBoard5.material);
        System.out.println("Color: " + chessBoard5.color);
        System.out.println("Price: " + chessBoard5.price);
        System.out.println("Squares: " + chessBoard5.squares);
        System.out.println("Is Foldable: " + chessBoard5.isFoldable);
    }
}