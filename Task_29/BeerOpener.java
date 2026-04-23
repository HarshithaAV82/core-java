class BeerOpener extends Opener{

    String brand;
    boolean automatic;
    String color;
    int weight;
    boolean portable;

    BeerOpener(){
        super();
        System.out.println("BeerOpener constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in BeerOpener...");
    }
}