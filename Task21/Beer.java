class Beer{

    int price;
    Company company;
    BeerType beerType;

    Beer(int price, Company company, BeerType beerType) {
        this.price = price;
        this.company = company;
        this.beerType = beerType;
    }

    void printInfo(){

        System.out.println("Beer Price: " + this.price);

        if (company != null){
            System.out.println("Company Name: " + company.name);
        } else {
            System.out.println("Company is null...");
        }

        if (beerType != null){
            System.out.println("Beer Type: " + beerType);
        } else {
            System.out.println("BeerType is null...");
        }
    }
}