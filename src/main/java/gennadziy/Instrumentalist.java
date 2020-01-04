package gennadziy;

public class Instrumentalist implements Performer {
    private int age;

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public Instrumentalist() {
    }
    public void perform()  {
        System.out.print("Playing " + song + " : "+ " mne let " +age);
        instrument.play();
    }
    private String song;
    private Instrument instrument;

    public String getSong () {
        return song;
    }
    public String screamSong() {
        return song;
    }

    public void setSong ( String song ) {
        this.song = song;
    }

    public void setInstrument ( Instrument instrument ) {
        this.instrument = instrument;
    }
}

