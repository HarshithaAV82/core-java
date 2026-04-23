class NapkinRunner{

    public static void main(String[] args) {

        Brand brand1 = new Brand("CleanSoft");
        Brand brand2 = new Brand("FreshCare");

        Napkin napkin1 = new Napkin(50, brand1, NapkinType.VELVEt);
        Napkin napkin2 = new Napkin(30, brand2, NapkinType.CLOTH);
        Napkin napkin3 = new Napkin(40, brand2, NapkinType.TISSUE);
        Napkin napkin4 = new Napkin(60, brand1, NapkinType.NYLON);

        napkin1.printInfo();
        napkin2.printInfo();
        napkin3.printInfo();
        napkin4.printInfo();
    }
}