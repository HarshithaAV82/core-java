class SatelliteOrbit extends Orbit{

    String satelliteName;
    int distance;
    boolean isArtificial;
    String missionType;
    boolean active;

    SatelliteOrbit(){
        super();
        System.out.println("SatelliteOrbit constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in SatelliteOrbit...");
    }
}