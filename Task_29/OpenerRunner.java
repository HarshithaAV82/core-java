class OpenerRunner{

    public static void main(String[] args) {

        BeerOpener beerOpener = new BeerOpener();
        System.out.println(beerOpener.type);
        System.out.println(beerOpener.material);
        System.out.println(beerOpener.size);
        System.out.println(beerOpener.brand);
        System.out.println(beerOpener.automatic);
        System.out.println(beerOpener.color);
        System.out.println(beerOpener.weight);
        System.out.println(beerOpener.portable);
        beerOpener.open();
        beerOpener.close();
        beerOpener.displayDetails();

        BeerOpener beerOpener1 = new BeerOpener();
        System.out.println(beerOpener1.type);
        System.out.println(beerOpener1.material);
        System.out.println(beerOpener1.size);
        System.out.println(beerOpener1.brand);
        System.out.println(beerOpener1.automatic);
        System.out.println(beerOpener1.color);
        System.out.println(beerOpener1.weight);
        System.out.println(beerOpener1.portable);
        beerOpener1.open();
        beerOpener1.close();
        beerOpener1.displayDetails();

        Opener opener1 = new BeerOpener();
        System.out.println(opener1.type);
        System.out.println(opener1.material);
        System.out.println(opener1.size);
        opener1.open();
        opener1.close();

        Opener opener2 = new BeerOpener();
        System.out.println(opener2.type);
        System.out.println(opener2.material);
        System.out.println(opener2.size);
        opener2.open();
        opener2.close();

        Opener consumer = new Opener();
        System.out.println(consumer.type);
        System.out.println(consumer.material);
        System.out.println(consumer.size);
        consumer.open();
        consumer.close();

        Opener consumer1 = new Opener();
        System.out.println(consumer1.type);
        System.out.println(consumer1.material);
        System.out.println(consumer1.size);
        consumer1.open();
        consumer1.close();
    }
}