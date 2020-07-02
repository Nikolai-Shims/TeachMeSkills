package Lesson6.cosmos;

public class Cosmodrom {
    //IStart object;
    //public Cosmodrom(IStart cosmosShip){
    //this.object = cosmosShip;
    //}


    public void zapysk(IStart iStart) {
       if(iStart.checkSistem() == false){
           System.out.println("Проверка корабля провалилась!");
       }
       else {
           iStart.startEngine();
           iStart.startStart();
       }
    }

}
