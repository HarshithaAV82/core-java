class Horlicks{

    int quantity;
    HorlicksBrand horlicksBrand;
    Flavor flavor;

    Horlicks(int quantity, HorlicksBrand horlicksBrand, Flavor flavor){
        this.quantity = quantity;
        this.horlicksBrand = horlicksBrand;
        this.flavor = flavor;
    }

    void printInfo(){

        System.out.println("Quantity: " + this.quantity);

        if (horlicksBrand != null){
            System.out.println("horlicksBrand: " + horlicksBrand.name);
        } else{
            System.out.println("horlicksBrand is null...");
        }

        if (flavor != null){
            System.out.println("Flavor: " + flavor);
        } else {
            System.out.println("Flavor is null...");
        }
    }
}