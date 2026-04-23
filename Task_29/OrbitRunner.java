class OrbitRunner{

    public static void main(String[] args) {

       
        SatelliteOrbit satelliteOrbit = new SatelliteOrbit();
        System.out.println(satelliteOrbit.planetName);
        System.out.println(satelliteOrbit.distanceFromPlanet);
        System.out.println(satelliteOrbit.orbitType);
        System.out.println(satelliteOrbit.satelliteName);
        System.out.println(satelliteOrbit.distance);
        System.out.println(satelliteOrbit.isArtificial);
        System.out.println(satelliteOrbit.missionType);
        System.out.println(satelliteOrbit.active);
        satelliteOrbit.revolve();
        satelliteOrbit.rotate();
        satelliteOrbit.displayDetails();

        SatelliteOrbit satelliteOrbit1 = new SatelliteOrbit();
        System.out.println(satelliteOrbit1.planetName);
        System.out.println(satelliteOrbit1.distanceFromPlanet);
        System.out.println(satelliteOrbit1.orbitType);
        System.out.println(satelliteOrbit1.satelliteName);
        System.out.println(satelliteOrbit1.distance);
        System.out.println(satelliteOrbit1.isArtificial);
        System.out.println(satelliteOrbit1.missionType);
        System.out.println(satelliteOrbit1.active);
        satelliteOrbit1.revolve();
        satelliteOrbit1.rotate();
        satelliteOrbit1.displayDetails();

        
        Orbit orbit = new SatelliteOrbit();
        System.out.println(orbit.planetName);
        System.out.println(orbit.distanceFromPlanet);
        System.out.println(orbit.orbitType);
        orbit.revolve();
        orbit.rotate();

        Orbit orbit1 = new SatelliteOrbit();
        System.out.println(orbit1.planetName);
        System.out.println(orbit1.distanceFromPlanet);
        System.out.println(orbit1.orbitType);
        orbit1.revolve();
        orbit1.rotate();

       
        Orbit orbit12 = new Orbit();
        System.out.println(orbit12.planetName);
        System.out.println(orbit12.distanceFromPlanet);
        System.out.println(orbit12.orbitType);
        orbit12.revolve();
        orbit12.rotate();

        Orbit orbit22 = new Orbit();
        System.out.println(orbit22.planetName);
        System.out.println(orbit22.distanceFromPlanet);
        System.out.println(orbit22.orbitType);
        orbit22.revolve();
        orbit22.rotate();
    }
}