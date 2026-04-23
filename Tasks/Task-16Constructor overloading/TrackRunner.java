class TrackRunner{

    public static void main(String[] args) {

        Track track = new Track("Running", "Bangalore", 400.0, 8.0, true);
        System.out.println("Type: " + track.type);
        System.out.println("Location: " + track.location);
        System.out.println("Length: " + track.length);
        System.out.println("Width: " + track.width);
        System.out.println("Is Indoor: " + track.isIndoor);

        Track track1 = new Track("Cycling");
        System.out.println("Type: " + track1.type);

        Track track2 = new Track("Mysore", 500.0);
        System.out.println("Location: " + track2.location);
        System.out.println("Length: " + track2.length);

        Track track3 = new Track(10.0, false);
        System.out.println("Width: " + track3.width);
        System.out.println("Is Indoor: " + track3.isIndoor);

        Track track4 = new Track("Chennai", 600.0, 9.0);
        System.out.println("Location: " + track4.location);
        System.out.println("Length: " + track4.length);
        System.out.println("Width: " + track4.width);

        Track track5 = new Track();
        System.out.println("Type: " + track5.type);
        System.out.println("Location: " + track5.location);
        System.out.println("Length: " + track5.length);
        System.out.println("Width: " + track5.width);
        System.out.println("Is Indoor: " + track5.isIndoor);
    }
}