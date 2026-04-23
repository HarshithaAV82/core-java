class Jamoon{

    String[] flavors;
    Sweet[] sweets;

    Jamoon(String[] flavors, Sweet[] sweets){
        this.flavors = flavors;
        this.sweets = sweets;
    }

    void display(){

        System.out.println("Jamoon Details");

        if(this.flavors != null){
            System.out.println("Total Flavors: " + this.flavors.length);

            for(String flavor : this.flavors){
                System.out.println("Flavor: " + flavor);
            }
        }

        if(this.sweets != null){
            System.out.println("Total Sweets: " + this.sweets.length);

            for(Sweet sweet : this.sweets){
                System.out.println("Sweet Type: " + sweet.name);
                System.out.println("Cost: " + sweet.cost);
            }
        }
    }
}