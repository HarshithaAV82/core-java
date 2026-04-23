class MassageCenter{

    String massageType;
    int price;

    MassageCenter(String massageType, int price){
        this.massageType = massageType;
        this.price = price;
    }

    void getSpa(){
        System.out.println("Massage Type: " + this.massageType);
        System.out.println("Price: " + this.price);
    }
}