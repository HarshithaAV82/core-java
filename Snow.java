class Snow{

    String type;
    double temperature;
    String season;
    double thickness;
    boolean isFrozen;

    Snow(String type, double temperature, String season, double thickness, boolean isFrozen){
        this.type = type;
        this.temperature = temperature;
        this.season = season;
        this.thickness = thickness;
        this.isFrozen = isFrozen;
    }

    Snow(String type){
        this.type = type;
    }

    Snow(double temperature, String season){
        this.temperature = temperature;
        this.season = season;
    }

    Snow(double thickness, boolean isFrozen){
        this.thickness = thickness;
        this.isFrozen = isFrozen;
    }

    Snow(String season, double thickness, boolean isFrozen){
        this.season = season;
        this.thickness = thickness;
        this.isFrozen = isFrozen;
    }

    Snow(){
    }
}