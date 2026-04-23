class PocketRunner{

    public static void main(String[] args) {

        Pocket pocket = new Pocket("Front", "Brown", 2.5);

        System.out.println("Pocket Type: " + pocket.type);
        System.out.println("Pocket Color: " + pocket.color);
        System.out.println("Pocket Capacity: " + pocket.capacity);
    }
}