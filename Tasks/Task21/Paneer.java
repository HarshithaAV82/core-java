class Paneer{

    int weight;
    Shop shop;
    PaneerType paneerType;

    Paneer(int weight, Shop shop, PaneerType paneerType){
        this.weight = weight;
        this.shop = shop;
        this.paneerType = paneerType;
    }

    void printInfo(){

        System.out.println("Paneer Weight: " + this.weight);

        if (shop != null){
            System.out.println("Shop Name: " + shop.name);
        } else {
            System.out.println("Shop is null...");
        }

        if (paneerType != null){
            System.out.println("Paneer Type: " + paneerType);
        } else {
            System.out.println("PaneerType is null...");
        }
    }
}