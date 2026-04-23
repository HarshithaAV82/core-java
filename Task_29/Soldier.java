class Soldier extends Army {

    String name;
    String position;
    boolean trained;
    String weapon;
    int experience;

    Soldier() {
        super();
        System.out.println("Soldier constructor...");
    }

    void displayDetails() {
        System.out.println("executing displayDetails in Soldier...");
    }
}