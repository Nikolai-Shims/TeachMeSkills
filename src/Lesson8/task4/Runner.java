package Lesson8.task4;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        try(ObjectOutputStream first = new ObjectOutputStream(new FileOutputStream("src\\Lesson8\\task4\\car.dat"))){
            Car bmw = new Car("BMW",190,5000);
            first.writeObject(bmw);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Lesson8\\task4\\car.dat"))){
            Car bmw = (Car)ois.readObject();
            System.out.println(bmw.getBrand()+ " " + bmw.getMaxSpeed() + " " + bmw.getPrice());
        }
        catch (Exception ee){
            System.out.println(ee.getMessage());
        }
    }
}
