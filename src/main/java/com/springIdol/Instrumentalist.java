package com.springIdol;

/**
 * Created by user on 30.09.14.
 */
public class Instrumentalist implements Performer{



    private String song;

    private Instrument instrument;


    public Instrumentalist() {



}



    public void perform() throws PerformanceException {


        System.out.println("PLay" + song + ":");

instrument.play();


    }


    public void setSong(String song) {
        this.song = song;
    }


    public String getSong() {
        return song;
    }

public String ScreamSong() {

    return song;

}


    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
