class CashewRunner{

    public static void main(String[] args) {

        Buyer buyer1 = new Buyer(800);
        Buyer buyer2 = new Buyer(950);

        Cashew cashew1 = new Cashew(5, buyer1, CashewType.SMALL);
        Cashew cashew2 = new Cashew(7, buyer2, CashewType.MEDIUM);
        Cashew cashew3 = new Cashew(6, null, CashewType.LARGE);
        Cashew cashew4 = new Cashew(9, buyer1, CashewType.PREMIUM);

        cashew1.printInfo();
        cashew2.printInfo();
        cashew3.printInfo();
        cashew4.printInfo();
    }
} 