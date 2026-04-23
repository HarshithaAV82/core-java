class PowerBank{

    String brandName;
    double price;
    String color;

    PowerBank(){
        System.out.println("PowerBank constructor...");
    }

    void charge(){
        System.out.println("PowerBank is charging...");
    }

    void stopCharge(){
        System.out.println("PowerBank stopped charging...");
    }
}