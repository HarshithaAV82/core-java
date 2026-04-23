class FactoryRunner{

    public static void main(String[] args){

        BeerFactory beerFactory = new BeerFactory();
        System.out.println(beerFactory.name);
        System.out.println(beerFactory.location);
        System.out.println(beerFactory.workers);
        System.out.println(beerFactory.beerBrand);
        System.out.println(beerFactory.bottlesProduced);
        System.out.println(beerFactory.isColdStorage);
        System.out.println(beerFactory.type);
        System.out.println(beerFactory.export);
        beerFactory.startProduction();
        beerFactory.stopProduction();
        beerFactory.displayDetails();

        BeerFactory beerFactory1 = new BeerFactory();
        System.out.println(beerFactory1.name);
        System.out.println(beerFactory1.location);
        System.out.println(beerFactory1.workers);
        System.out.println(beerFactory1.beerBrand);
        System.out.println(beerFactory1.bottlesProduced);
        System.out.println(beerFactory1.isColdStorage);
        System.out.println(beerFactory1.type);
        System.out.println(beerFactory1.export);
        beerFactory1.startProduction();
        beerFactory1.stopProduction();
        beerFactory1.displayDetails();

        
        Factory factory = new BeerFactory();
        System.out.println(factory.name);
        System.out.println(factory.location);
        System.out.println(factory.workers);
        factory.startProduction();
        factory.stopProduction();

        Factory factory1 = new BeerFactory();
        System.out.println(factory1.name);
        System.out.println(factory1.location);
        System.out.println(factory1.workers);
        factory1.startProduction();
        factory1.stopProduction();

        Factory produce = new Factory();
        System.out.println(produce.name);
        System.out.println(produce.location);
        System.out.println(produce.workers);
        produce.startProduction();
        produce.stopProduction();

        Factory produce1 = new Factory();
        System.out.println(produce1.name);
        System.out.println(produce1.location);
        System.out.println(produce1.workers);
        produce1.startProduction();
        produce1.stopProduction();
    }
}