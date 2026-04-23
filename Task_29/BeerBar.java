class BeerBar extends Bar {

    String ownerName;
    int varieties;
    boolean freshBeer;
    boolean expired;
    String manufactured;

    BeerBar() {
        super();
        System.out.println("BeerBar constructor...");
    }

    void displayDetails() {
        System.out.println("executing displayDetails in BeerBar...");
    }
}