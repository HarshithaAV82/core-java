class GameBoardRunner{

    public static void main(String[] args){

        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard.boardName);
        System.out.println(chessBoard.size);
        System.out.println(chessBoard.material);
        System.out.println(chessBoard.numberOfPieces);
        System.out.println(chessBoard.hasTimer);
        System.out.println(chessBoard.colorType);
        System.out.println(chessBoard.isFoldable);
        System.out.println(chessBoard.difficultyLevel);
        chessBoard.startGame();
        chessBoard.endGame();
        chessBoard.displayDetails();

        ChessBoard chessBoard2 = new ChessBoard();
        System.out.println(chessBoard2.boardName);
        System.out.println(chessBoard2.size);
        System.out.println(chessBoard2.material);
        System.out.println(chessBoard2.numberOfPieces);
        System.out.println(chessBoard2.hasTimer);
        System.out.println(chessBoard2.colorType);
        System.out.println(chessBoard2.isFoldable);
        System.out.println(chessBoard2.difficultyLevel);
        chessBoard2.startGame();
        chessBoard2.endGame();
        chessBoard2.displayDetails();

      
        GameBoard gameBoard = new ChessBoard();
        System.out.println(gameBoard.boardName);
        System.out.println(gameBoard.size);
        System.out.println(gameBoard.material);
        gameBoard.startGame();
        gameBoard.endGame();

        GameBoard gameBoard1 = new ChessBoard();
        System.out.println(gameBoard1.boardName);
        System.out.println(gameBoard1.size);
        System.out.println(gameBoard1.material);
        gameBoard1.startGame();
        gameBoard1.endGame();

        GameBoard Board1 = new GameBoard();
        System.out.println(Board1.boardName);
        System.out.println(Board1.size);
        System.out.println(Board1.material);
        Board1.startGame();
        Board1.endGame();

        GameBoard Board2 = new GameBoard();
        System.out.println(Board2.boardName);
        System.out.println(Board2.size);
        System.out.println(Board2.material);
        Board2.startGame();
        Board2.endGame();
    }
}