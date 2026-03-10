class BannerRunner{

    public static void main(String[] args){

        String[] titles = new String[3];
        titles[0] = "Festival Offer";
        titles[1] = "New Shop Opening";
        titles[2] = "Special Discount";

        Stand[] stands = new Stand[3];
        stands[0] = new Stand("Metal", 6);
        stands[1] = new Stand("Plastic", 5);
        stands[2] = new Stand("Wood", 7);

        Banner banner = new Banner(titles, stands);
        banner.display();
    }
}