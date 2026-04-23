class InstrumentRunner{

    public static void main(String[] args){

        
        MusicInstrument musicInstrument = new MusicInstrument();
        System.out.println(musicInstrument.name);
        System.out.println(musicInstrument.type);
        System.out.println(musicInstrument.price);
        System.out.println(musicInstrument.brand);
        System.out.println(musicInstrument.electric);
        System.out.println(musicInstrument.soundType);
        System.out.println(musicInstrument.weight);
        System.out.println(musicInstrument.portable);
        musicInstrument.play();
        musicInstrument.stop();
        musicInstrument.displayDetails();

        MusicInstrument musicInstrument1 = new MusicInstrument();
        System.out.println(musicInstrument1.name);
        System.out.println(musicInstrument1.type);
        System.out.println(musicInstrument1.price);
        System.out.println(musicInstrument1.brand);
        System.out.println(musicInstrument1.electric);
        System.out.println(musicInstrument1.soundType);
        System.out.println(musicInstrument1.weight);
        System.out.println(musicInstrument1.portable);
        musicInstrument1.play();
        musicInstrument1.stop();
        musicInstrument1.displayDetails();

       
        Instrument instrument = new MusicInstrument();
        System.out.println(instrument.name);
        System.out.println(instrument.type);
        System.out.println(instrument.price);
        instrument.play();
        instrument.stop();

        Instrument instrument1 = new MusicInstrument();
        System.out.println(instrument1.name);
        System.out.println(instrument1.type);
        System.out.println(instrument1.price);
        instrument1.play();
        instrument1.stop();

        Instrument music = new Instrument();
        System.out.println(music.name);
        System.out.println(music.type);
        System.out.println(music.price);
        music.play();
        music.stop();

        Instrument music1 = new Instrument();
        System.out.println(music1.name);
        System.out.println(music1.type);
        System.out.println(music1.price);
        music1.play();
        music1.stop();
    }
}