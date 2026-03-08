class AquariumRunner{

    public static void main(String[] args){

        Fish fish = new Fish("GoldFish", 10);

        WaterLevel waterLevel = new WaterLevel("Fresh", 5);

        Plant plant = new Plant("Green", 3);

        Light light = new Light(true, 40);

        Filter filter = new Filter(20, "AquaTech");

        Aquarium aquarium = new Aquarium(fish, waterLevel, plant, light, filter);

        aquarium.getAquariumInfo();
    }
}