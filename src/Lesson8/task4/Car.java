package Lesson8.task4;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car(){}
    public Car(String brand, int maxSpeed, int price){this.brand = brand; this.maxSpeed = maxSpeed; this.price = price;}

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setMaxSpeed(int maxSpeed){this.maxSpeed = maxSpeed;}
    public int getMaxSpeed(){ return maxSpeed; }

    public int getPrice(){ return price; }
    public void setPrice(int price){ this.price = price; }
}
