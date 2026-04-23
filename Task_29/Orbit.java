class Orbit{

    String planetName;
    double distanceFromPlanet;
    String orbitType;

    Orbit(){
        System.out.println("Orbit constructor...");
    }

    void revolve(){
        System.out.println("Orbit is revolving around the earth...");
    }

    void rotate(){
        System.out.println("orbit is rotating around the earth...");
    }
}