class StoreSingerRunner {

    public static void main(String[] args) {

        String[] singers = new String[5];

        StoreSinger storeSinger = new StoreSinger(singers);

        storeSinger.getSingerName("ArijitSingh");
        storeSinger.getSingerName("ShreyaGhoshal");
        storeSinger.getSingerName("SonuNigam");

        System.out.println(storeSinger.searchSingerName("KK"));
        System.out.println(storeSinger.searchSingerName("SidSriram"));

        storeSinger.update(1, "HHemma");
        storeSinger.update("NehaKakkar", "SonuNigam");

        storeSinger.delete(0);
        storeSinger.delete("HHemma");
    }
}