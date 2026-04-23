class BeerRunner{

    public static void main(String[] args){

        Company c1 = new Company("Kingfisher");
        Company c2 = new Company("Budweiser");

        Beer b1 = new Beer(150, c1, BeerType.LIGHT);
        Beer b2 = new Beer(180, c2, BeerType.STRONG);
        Beer b3 = new Beer(200, null, BeerType.DARK);
        Beer b4 = new Beer(220, c1, BeerType.PREMIUM);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();
    }
}