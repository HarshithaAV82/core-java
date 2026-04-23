class DiseaseCarrier extends Carrier{

    boolean hasSymptoms;
    boolean contagious;
    String carrierType;
    int daysInfected;
    boolean recovered;

    DiseaseCarrier(){
        super();
        System.out.println("DiseaseCarrier constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in DiseaseCarrier...");
    }
}