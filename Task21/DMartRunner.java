class DMartRunner{

    public static void main(String[] args) {

        Manager manager1 = new Manager("Harshitha");
        Manager manager2 = new Manager("Hema");

        DMart dmart1 = new DMart(500, manager1, Item.GROCERY);
        DMart dmart2 = new DMart(300, manager2, Item.CLOTHING);
        DMart dmart3 = new DMart(200, manager1, Item.ACCESSORIES);
        DMart dmart4 = new DMart(450, manager1, Item.PLASTICS);

        dmart1.printInfo();
        dmart2.printInfo();
        dmart3.printInfo();
        dmart4.printInfo();
    }
}