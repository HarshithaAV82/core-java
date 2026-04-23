class Filter{

    int power;
    String brand;

    Filter(int power, String brand){
        this.power = power;
        this.brand = brand;
    }

    void getAquarium(){
        System.out.println("Filter Power: " + this.power);
        System.out.println("Brand: " + this.brand);
    }
}