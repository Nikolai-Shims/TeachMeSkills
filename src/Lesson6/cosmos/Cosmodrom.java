package Lesson6.cosmos;

public class Cosmodrom {
    IStart object;


    public Cosmodrom(IStart cosmosShip){
        this.object = cosmosShip;
    }


    public void zapysk() {
       object.checkSistem();
       object.startEngine();
       object.startStart();
    }

}
