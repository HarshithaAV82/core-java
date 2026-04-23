class Instrument extends MusicInstrument{

   
    Instrument(){
        super("guitar", "arjun", 15000);
		System.out.println("In this method i have done implicit or default values....");
		System.out.println("running Instrument const with no parameters ....");
    }

  
    Instrument(String instrumentName){
        super(instrumentName, "krishna", 20000);
		System.out.println("In this method i have done explicitly only for instrumentName... ");
	    System.out.println("running Instrument const with having one parameters ....");

    }

    Instrument(String instrumentName, String composerName, double instrumentPrice){
        super(instrumentName, composerName, instrumentPrice);
		System.out.println("In this method i have done all three parameters has a explicitly...");
		System.out.println("running Instrument const with having three parameters ....");

    }
}