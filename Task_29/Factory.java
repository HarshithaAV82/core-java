class Factory{

    String name;
    String location;
    int workers;

    Factory(){
        System.out.println("Factory constructor...");
    }

    void startProduction(){
        System.out.println("Production started...");
    }

    void stopProduction(){
        System.out.println("Production stopped...");
    }
}