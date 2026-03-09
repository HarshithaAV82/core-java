class FortRunner{

    public static void main(String[] args) {

        King king1 = new King("Shivaji");
        King king2 = new King("Krishnadevaraya");

        Fort fort1 = new Fort(500, king1, FortType.HILL);
        Fort fort2 = new Fort(300, king2, FortType.SEA);
        Fort fort3 = new Fort(400, king2, FortType.DESERT);
        Fort fort4 = new Fort(600, king1, FortType.FOREST);

        fort1.printInfo();
        fort2.printInfo();
        fort3.printInfo();
        fort4.printInfo();
    }
}