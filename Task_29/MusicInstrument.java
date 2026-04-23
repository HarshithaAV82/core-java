class MusicInstrument extends Instrument {

    String brand;
    boolean electric;
    String soundType;
    int weight;
    boolean portable;

    MusicInstrument() {
        super();
        System.out.println("MusicInstrument constructor...");
    }

    void displayDetails() {
        System.out.println("MusicInstrument details...");
    }
}