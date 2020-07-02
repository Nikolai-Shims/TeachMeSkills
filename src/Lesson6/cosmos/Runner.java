package Lesson6.cosmos;

public class Runner {



    public static void main(String[] args) {

        //   Cosmodrom cosmodrom = new Cosmodrom(new Shuttle("mir"));
        // cosmodrom.zapysk();
        //Cosmodrom cosmodrom1 = new Cosmodrom(new SpaceX());
        //cosmodrom1.zapysk();

        Cosmodrom cosmodrom = new Cosmodrom();
        Shuttle shuttle = new Shuttle("Saturn");
        SpaceX spaceX = new SpaceX();

        cosmodrom.zapysk(shuttle);
        cosmodrom.zapysk(spaceX);
    }

}
