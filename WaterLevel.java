class WaterLevel{

    String type;
    int level;

    WaterLevel(String type, int level){
        this.type = type;
        this.level = level;
    }

    void getAquarium(){
        System.out.println("Water Type: " + this.type);
        System.out.println("Water Level: " + this.level);
    }
}