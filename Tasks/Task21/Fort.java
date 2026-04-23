class Fort{

    int height;
    King king;
    FortType fortType;

    Fort(int height, King king, FortType fortType){
        this.height = height;
        this.king = king;
        this.fortType = fortType;
    }

    void printInfo(){

        System.out.println("Fort Height: " + this.height);

        if (king != null){
            System.out.println("King Name: " + this.king.name);
        } else {
            System.out.println("King is null...");
        }

        if (fortType != null){
            System.out.println("Fort Type: " + this.fortType);
        } else {
            System.out.println("FortType is null...");
        }
    }
}