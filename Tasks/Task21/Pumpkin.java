class Pumpkin{

    int weight;
    Farmerr farmer;
    PumpkinType pumpkinType;

    Pumpkin(int weight, Farmerr farmer, PumpkinType pumpkinType) {
        this.weight = weight;
        this.farmer = farmer;
        this.pumpkinType = pumpkinType;
    }

    void printInfo(){

        System.out.println("Pumpkin Weight: " + this.weight);

        if (farmer != null){
            System.out.println("Farmer Name: " +this.farmer.name);
        } else {
            System.out.println("Farmer is null...");
        }

        if (pumpkinType != null){
            System.out.println("Pumpkin Type: " + this.pumpkinType);
        } else {
            System.out.println("PumpkinType is null...");
        }
    }
}