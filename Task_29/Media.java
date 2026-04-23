class Media{

    String name;
    String type;
    int users;

    Media(){
        System.out.println("Media constructor...");
    }

    void play(){
        System.out.println("Media is playing...");
    }

    void stop(){
        System.out.println("Media stopped...");
    }
}