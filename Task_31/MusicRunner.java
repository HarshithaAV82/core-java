class MusicRunner{

    public static void main(String[] args){

   
        Instrument instrument = new Instrument();
        System.out.println(instrument.instrumentName);
        System.out.println(instrument.composerName);
        System.out.println(instrument.instrumentPrice);

      
        Instrument instrument1 = new Instrument("Piano");
        System.out.println(instrument1.instrumentName);
        System.out.println(instrument1.composerName);
        System.out.println(instrument1.instrumentPrice);

        
        Instrument instrument2 = new Instrument("Drum", "kiran", 30000);
        System.out.println(instrument2.instrumentName);
        System.out.println(instrument2.composerName);
        System.out.println(instrument2.instrumentPrice);
    }
}