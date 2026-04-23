class OfficePowerBank extends PowerBank{

    int numberOfPorts;
    boolean fastCharging;
    boolean wirelessCharging;
    String displayType;
    boolean isPortable;

    OfficePowerBank(){
        super();
        System.out.println("OfficePowerBank constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in OfficePowerBank...");
    }
}