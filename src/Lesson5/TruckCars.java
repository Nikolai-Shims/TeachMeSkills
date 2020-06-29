package Lesson5;

import java.io.IOException;
import java.util.Scanner;

public class TruckCars extends Ground{
    float carrying;
    public void setCarrying(float carrying){ this.carrying = carrying; }
    public float getCarrying(){ return carrying; }





    @Override
    public void descriptionGround() {
        super.descriptionGround();
        System.out.println(", максимальная загрузка: " + carrying );
        System.out.println("мощность в Kwt = "+ getKwt());
    }
    TruckCars(String brand, int power, int maxSpeed, int weight, int amountWheels, float fuelConsuption, float carrying) {
        super(brand, power, maxSpeed, weight, amountWheels, fuelConsuption);
        this.carrying = carrying;
    }
    TruckCars(){}


    public void checkTruckWeight(){
        System.out.println("Введите ваше количество груза:");
        Scanner scan = new Scanner(System.in);
        float newWeight = scan.nextFloat();
        float weight = getCarrying();
        if(newWeight <= weight ) {
            System.out.println("Грузовик загружен!");
        }
        else {
            System.out.println("Вам нужен грузовик побольше.");
        }

    }

    public static void main(String[] args) throws IOException {
        TruckCars dd = new TruckCars();
        dd.setFuelConsuption((float)19.8);
        dd.setAmountWheels(8);
        dd.setWeight(3500);
        dd.setMaxSpeed(120);
        dd.setPower(350);
        dd.setBrand("Volvo");
        dd.setCarrying(8000);
        dd.descriptionGround();
        dd.checkTruckWeight();

        TruckCars eee = new TruckCars("scania",310,140,5000,6,(float)20.3,10000);
        eee.descriptionGround();
        eee.checkTruckWeight();
    }



}
