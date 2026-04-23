class BaloonRunner{

    public static void main(String[] args){

        Party party1 = new Party();
        System.out.println(party1.name);
        System.out.println(party1.price);
        System.out.println(party1.color);
        System.out.println(party1.shopOwner);
        System.out.println(party1.location);
        System.out.println(party1.quantity);
        System.out.println(party1.isDecorated);
        System.out.println(party1.isHelium);
        party1.celebrate();
        party1.blast();
        party1.displayDetails();

        Party party2 = new Party();
        System.out.println(party2.name);
        System.out.println(party2.price);
        System.out.println(party2.color);
        System.out.println(party2.shopOwner);
        System.out.println(party2.location);
        System.out.println(party2.quantity);
        System.out.println(party2.isDecorated);
        System.out.println(party2.isHelium);
        party2.celebrate();
        party2.blast();
        party2.displayDetails();

        Baloon baloon1 = new Party();
        System.out.println(baloon1.name);
        System.out.println(baloon1.price);
        System.out.println(baloon1.color);
        baloon1.celebrate();
        baloon1.blast();

        Baloon baloon2 = new Party();
        System.out.println(baloon2.name);
        System.out.println(baloon2.price);
        System.out.println(baloon2.color);
        baloon2.celebrate();
        baloon2.blast();

        
        Baloon balooo1 = new Baloon();
        System.out.println(balooo1.name);
        System.out.println(balooo1.price);
        System.out.println(balooo1.color);
        balooo1.celebrate();
        balooo1.blast();

        Baloon balooo2 = new Baloon();
        System.out.println(balooo2.name);
        System.out.println(balooo2.price);
        System.out.println(balooo2.color);
        balooo2.celebrate();
        balooo2.blast();
    }
}