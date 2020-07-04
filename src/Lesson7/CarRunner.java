package Lesson7;

public class CarRunner {
    public static void main(String[] args) {
        Car audi = new Car("audi", 230, 50000);
        Car bmw = new Car("bmw",225,35000);

        try {
            audi.start();
        }
        catch (MyException e) {
            System.out.println(e);}

        try {
            bmw.start();
        }
        catch (MyException ex ){
            System.out.println(ex);
        }

    }
}
