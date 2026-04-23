class ReelRunner{

    public static void main(String[] args){

        InstaReel reel = new InstaReel();
        System.out.println(reel.numberOfLikes);
        System.out.println(reel.numberOfViews);
        System.out.println(reel.isTrending);

        
        InstaReel reel1 = new InstaReel(500);
        System.out.println(reel1.numberOfLikes);
        System.out.println(reel1.numberOfViews);
        System.out.println(reel1.isTrending);


   
        InstaReel reel2 = new InstaReel(1000, 20000, true);
        System.out.println(reel2.numberOfLikes);
        System.out.println(reel2.numberOfViews);
        System.out.println(reel2.isTrending);
    }
}