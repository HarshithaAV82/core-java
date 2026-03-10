class JokerRunner{

    public static void main(String[] args){

        String[] jokerNames = new String[3];
        jokerNames[0] = "sanjya";
        jokerNames[1] = "manhendra";
        jokerNames[2] = "manu";

        District[] districts = new District[3];
        districts[0] = new District("Mysuru", 3000000);
        districts[1] = new District("Tumkur", 2700000);
        districts[2] = new District("Mandya", 1800000);

        Joker joker = new Joker(jokerNames, districts);
        joker.display();
    }
}