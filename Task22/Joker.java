class Joker{

    String[] jokerNames;
    District[] districts;

    Joker(String[] jokerNames, District[] districts){
        this.jokerNames = jokerNames;
        this.districts = districts;
    }

    void display(){

        System.out.println("Joker District Information");

        if(this.jokerNames != null){
            System.out.println("Total Jokers: " + this.jokerNames.length);
            for(String name : this.jokerNames){
                System.out.println("Joker Name: " + name);
            }
        }

        if(this.districts != null){
            System.out.println("Total Districts: " + this.districts.length);
            for(District district : this.districts){
                System.out.println("District Name: " + district.name);
                System.out.println("Population: " + district.population);
            }
        }
    }
}