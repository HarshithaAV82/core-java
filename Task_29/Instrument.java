class Instrument{

    String name;
    String type;
    int price;

    Instrument(){
        System.out.println("Instrument constructor...");
    }

    void play(){
        System.out.println("Playing instrument...");
    }

    void stop(){
        System.out.println("Stopped playing...");
    }
}