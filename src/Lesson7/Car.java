package Lesson7;

import java.util.Random;

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car (String brand, int maxSpeed, int price){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price; }

        public Car () {}

    public void setBrand(String brand){ this.brand = brand; }
    public String getBrand(){ return brand; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public void setPrice(int price) { this.price = price; }
    public int getPrice(){return price;}

    public void start() throws MyException {
        MyException myException = new MyException();
        Random random = new Random();
        int r = random.nextInt(20);
        if(r % 2 == 0 ){
            System.out.println("Автомобиль " + getBrand() + " не смог завестись" );
            throw myException;}
            else{
            System.out.println("Автомобиль " + getBrand() + " завелся.");
            }


    }
}
