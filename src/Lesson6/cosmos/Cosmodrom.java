package Lesson6.cosmos;

public class Cosmodrom {
    IStart pes;


    public Cosmodrom(IStart korable){
        this.pes = korable;
    }


    public void zapysk() {
       pes.checkSistem();
       pes.startEngine();
       pes.startStart();
    }

}
