class Mushroom{

    int quantity;
    Farmer farmer;
    MushroomType mushroomType;

    Mushroom(int quantity, Farmer farmer, MushroomType mushroomType) {
        this.quantity = quantity;
        this.farmer = farmer;
        this.mushroomType = mushroomType;
    }

    void printInfo(){

        System.out.println("Quantity: " + this.quantity);

        if (farmer != null){
            System.out.println("Farmer Name: " + this.farmer.name);
        } else {
            System.out.println("Farmer is null...");
        }
        if (mushroomType != null){
            System.out.println("Mushroom Type: " + mushroomType);
        } else {
            System.out.println("MushroomType is null...");
        }
    }
}