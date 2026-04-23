class Battery{

    String brand;
    String type;
    double capacity;
    double voltage;
    boolean isRechargeable;

    Battery(String brand, String type, double capacity, double voltage, boolean isRechargeable){
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.voltage = voltage;
        this.isRechargeable = isRechargeable;
    }

    Battery(String brand){
        this.brand = brand;
    }

    Battery(String type, double capacity){
        this.type = type;
        this.capacity = capacity;
    }

    Battery(double voltage, boolean isRechargeable){
        this.voltage = voltage;
        this.isRechargeable = isRechargeable;
    }

    Battery(String type, double capacity, double voltage){
        this.type = type;
        this.capacity = capacity;
        this.voltage = voltage;
    }

    Battery(){
    }
}