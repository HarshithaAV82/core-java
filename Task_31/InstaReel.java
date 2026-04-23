class InstaReel extends Reel{
	
	InstaReel(){
		super(6000, 80000, true);
	    System.out.println("In this method i have done implicit or default values....");
		System.out.println("running InstaReel const with no parameters ....");
	}
	InstaReel(int numberOfLikes){
		super(numberOfLikes, 5000, true);
		System.out.println("In this method i have done explicit only for numberOfLikes... ");
	    System.out.println("running InstaReel const with having one parameters ....");
	}
	InstaReel(int numberOfLikes,int numberOfViews,boolean isTrending){
		super(numberOfLikes, numberOfViews, isTrending);
	    System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running InstaReel const with having three parameters ....");
	}
	
}
