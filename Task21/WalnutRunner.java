class WalnutRunner{

    public static void main(String[] args) {

        Consumer consumer1 = new Consumer(500);
        Consumer consumer2 = new Consumer(650);

        Walnut walnut1 = new Walnut(10, consumer1, WalnutType.ORGANIC);
        Walnut walnut2 = new Walnut(8, consumer2, WalnutType.RAW);
        Walnut walnut3 = new Walnut(12, consumer1, WalnutType.ROASTED);
        Walnut walnut4 = new Walnut(15, consumer1, WalnutType.PREMIUM);

        walnut1.printInfo();
        walnut2.printInfo();
        walnut3.printInfo();
        walnut4.printInfo();
    }
}