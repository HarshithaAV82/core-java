class Aquarium{

    int size = 50;
    boolean clean = true;
    double price = 1500.5;
    double waterQuanity = 5.5;
    int fishesCount = 10;

    Fish fish;
    WaterLevel waterLevel;
    Plant plant;
    Light light;
    Filter filter;

    Aquarium(Fish fish, WaterLevel waterLevel, Plant plant, Light light, Filter filter){

        this.fish = fish;
        this.waterLevel = waterLevel;
        this.plant = plant;
        this.light = light;
        this.filter = filter;

        System.out.println("Created Aquarium using fish waterLevel plant light filter with constructor");
    }

    void getAquariumInfo(){

        if(this.fish != null){
            this.fish.getAquarium();
        }else{
            System.out.println("Fish is null");
        }

        if(this.waterLevel != null){
            this.waterLevel.getAquarium();
        }else{
            System.out.println("WaterLevel is null");
        }

        if(this.plant != null){
            this.plant.getAquarium();
        }else{
            System.out.println("Plant is null");
        }

        if(this.light != null){
            this.light.getAquarium();
        }else{
            System.out.println("Light is null");
        }

        if(this.filter != null){
            this.filter.getAquarium();
        }else{
            System.out.println("Filter is null");
        }
    }
}