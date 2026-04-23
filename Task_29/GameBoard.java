class GameBoard{

    String boardName;
    int size;
    String material;

    GameBoard(){
        System.out.println("GameBoard constructor...");
    }

    void startGame(){
        System.out.println("Game started...");
    }

    void endGame(){
        System.out.println("Game ended...");
    }
}