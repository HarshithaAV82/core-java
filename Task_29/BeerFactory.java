class BeerFactory extends Factory{

    String beerBrand;
    int bottlesProduced;
    boolean isColdStorage;
    String type;
    boolean export;

    BeerFactory(){
        super();
        System.out.println("BeerFactory constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in BeerFactory...");
    }
}