package Lesson5;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;

public class AirPassenger extends Air {
    private int countPassenger;
    private boolean bussinesClass;

    AirPassenger(){}
    AirPassenger(String brand,int power, int maxSpeed, int weight, float sizeWings,int runawayLength,int countPassenger, boolean bussinesClass ){
        this.setBrand(brand);
        this.setPower(power);
        this.setMaxSpeed(maxSpeed);
        this.setWeight(weight);
        this.setSizeWings(sizeWings);
        this.setRunawayLength(runawayLength);
        this.setCountPassenger(countPassenger);
        this.setBussinesClass(bussinesClass);
    }

    public int getCountPassenger(){ return countPassenger; }
    public void setCountPassenger(int countPassenger){ this.countPassenger = countPassenger; }


    public void setBussinesClass(boolean bussinesClass){ this.bussinesClass = bussinesClass; }
    public boolean getBussinesClass(){ return bussinesClass; }


    public void checkCountPassenger(){
        System.out.println("введите количество пассажиров: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        if(countPassenger >= count){
            System.out.println("Самолет взлетает!");
        }
        else {
            System.out.println("слишком много пассажиров, нужно найти самолет побольше.");
        }
    }

    public void descriptionAirpassenger(){
        System.out.println(descriptionAir() + "м, колличество пассажиров " + getCountPassenger() + " наличие бизнес класса " + getBussinesClass());
        System.out.println("Мощность в Kwt: " + getKwt());
    }

    public static void main(String[] args) throws IOException {
        AirPassenger as = new AirPassenger();
        as.setBussinesClass(false);
        as.setCountPassenger(160);
        as.setRunawayLength(1500);
        as.setSizeWings(200);
        as.setWeight(11250);
        as.setMaxSpeed(900);
        as.setPower(1700);
        as.setBrand("boing");
        as.descriptionAirpassenger();
        as.checkCountPassenger();

        AirPassenger ad = new AirPassenger("boing",1500,780,9850,(float)180.5,1250,90,true);
        ad.descriptionAirpassenger();
        ad.checkCountPassenger();
    }

}
