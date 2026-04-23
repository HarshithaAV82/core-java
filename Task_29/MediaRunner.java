class MediaRunner{

    public static void main(String[] args) {

       
        SocialMedia socialMedia = new SocialMedia();
        System.out.println(socialMedia.name);
        System.out.println(socialMedia.type);
        System.out.println(socialMedia.users);
        System.out.println(socialMedia.platformName);
        System.out.println(socialMedia.followers);
        System.out.println(socialMedia.isPrivate);
        System.out.println(socialMedia.contentType);
        System.out.println(socialMedia.liveStreaming);
        socialMedia.play();
        socialMedia.stop();
        socialMedia.displayDetails();

        SocialMedia socialMedia1 = new SocialMedia();
        System.out.println(socialMedia1.name);
        System.out.println(socialMedia1.type);
        System.out.println(socialMedia1.users);
        System.out.println(socialMedia1.platformName);
        System.out.println(socialMedia1.followers);
        System.out.println(socialMedia1.isPrivate);
        System.out.println(socialMedia1.contentType);
        System.out.println(socialMedia1.liveStreaming);
        socialMedia1.play();
        socialMedia1.stop();
        socialMedia1.displayDetails();


        Media media1 = new SocialMedia();
        System.out.println(media1.name);
        System.out.println(media1.type);
        System.out.println(media1.users);
        media1.play();
        media1.stop();

        Media media2 = new SocialMedia();
        System.out.println(media2.name);
        System.out.println(media2.type);
        System.out.println(media2.users);
        media2.play();
        media2.stop();

        Media news = new Media();
        System.out.println(news.name);
        System.out.println(news.type);
        System.out.println(news.users);
        news.play();
        news.stop();

        Media news1 = new Media();
        System.out.println(news1.name);
        System.out.println(news1.type);
        System.out.println(news1.users);
        news1.play();
        news1.stop();
    }
}