class BarRunner{

    public static void main(String[] args) {

        
        BeerBar beerBar = new BeerBar();
        System.out.println(beerBar.name);
        System.out.println(beerBar.location);
        System.out.println(beerBar.price);
        System.out.println(beerBar.ownerName);
        System.out.println(beerBar.varieties);
        System.out.println(beerBar.freshBeer);
        System.out.println(beerBar.expired);
        System.out.println(beerBar.manufactured);
        beerBar.open();
        beerBar.close();
        beerBar.displayDetails();

        BeerBar beerBar1 = new BeerBar();
        System.out.println(beerBar1.name);
        System.out.println(beerBar1.location);
        System.out.println(beerBar1.price);
        System.out.println(beerBar1.ownerName);
        System.out.println(beerBar1.varieties);
        System.out.println(beerBar1.freshBeer);
        System.out.println(beerBar1.expired);
        System.out.println(beerBar1.manufactured);
        beerBar1.open();
        beerBar1.close();
        beerBar1.displayDetails();

        Bar bar1 = new BeerBar();
        System.out.println(bar1.name);
        System.out.println(bar1.location);
        System.out.println(bar1.price);
        bar1.open();
        bar1.close();

        Bar bar2 = new BeerBar();
        System.out.println(bar2.name);
        System.out.println(bar2.location);
        System.out.println(bar2.price);
        bar2.open();
        bar2.close();


        Bar drink = new Bar();
        System.out.println(drink.name);
        System.out.println(drink.location);
        System.out.println(drink.price);
        drink.open();
        drink.close();

        Bar drink1 = new Bar();
        System.out.println(drink1.name);
        System.out.println(drink1.location);
        System.out.println(drink1.price);
        drink1.open();
        drink1.close();
    }
}