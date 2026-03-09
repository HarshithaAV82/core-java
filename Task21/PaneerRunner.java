class PaneerRunner{

    public static void main(String[] args) {

        Shop shop1 = new Shop("Milk Dairy");
        Shop shop2 = new Shop("Fresh Dairy");

        Paneer p1 = new Paneer(2, shop1, PaneerType.SOFT);
        Paneer p2 = new Paneer(3, shop2, PaneerType.FRESH);
        Paneer p3 = new Paneer(4, null, PaneerType.ORGANIC);
        Paneer p4 = new Paneer(5, shop1, PaneerType.MALAI);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}