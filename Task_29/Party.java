class Party extends Baloon{

    String shopOwner;
    String location;
    int quantity;
    boolean isDecorated;
    boolean isHelium;

    Party(){
        super();
        System.out.println("Party constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in Party...");
    }
}