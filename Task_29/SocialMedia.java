class SocialMedia extends Media{

    String platformName;
    int followers;
    boolean isPrivate;
    String contentType;
    boolean liveStreaming;

    SocialMedia(){
        super();
        System.out.println("SocialMedia constructor...");
    }

    void displayDetails(){
        System.out.println("executing displayDetails in SocialMedia...");
    }
}