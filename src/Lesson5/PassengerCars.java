package Lesson5;


import java.io.IOException;
import java.util.Scanner;

public class PassengerCars extends Ground {
    private String carBody;
    private int amountPassenger;
    public static void main(String[] args) throws IOException {
        PassengerCars ss = new PassengerCars();
        ss.setAmountWheels(4);
        ss.setBrand("audi");
        ss.setMaxSpeed(260);
        ss.setWeight(2000);
        ss.setPower(190);
        ss.setAmountPassenger(5);
        ss.setCarBody("sedan");
        ss.setFuelConsuption(10);
        ss.descriptionGround();
        System.out.println();
        ss.maxCharacteristic();



        PassengerCars toyota = new PassengerCars("Toyota", 110, 150,1200, 4, (float) 7.5,"седан",5);
        toyota.descriptionGround();
        toyota.maxCharacteristic();
    }

   PassengerCars(){}
    PassengerCars(String brand, int power, int maxSpeed, int weight, int amountWheels, float fuelConsuption, String carBody, int amountPassenger){
    this.setBrand(brand);
    this.setPower(power);
    this.setMaxSpeed(maxSpeed);
    this.setMaxSpeed(weight);
    this.setAmountWheels(amountWheels);
    this.setFuelConsuption(fuelConsuption);
    this.setCarBody(carBody);
    this.setAmountPassenger(amountPassenger);
    }

    public void setCarBody(String carBody) { this.carBody = carBody; }
    public String getCarBody() { return carBody; }

    public void setAmountPassenger(int amountPassenger) { this.amountPassenger = amountPassenger; }
    public int getAmountPassenger() { return amountPassenger; }



    private void maxCharacteristic() {
        System.out.println("Введите время: ");
        Scanner scan = new Scanner(System.in);
        float getcount = scan.nextFloat();
        float r = getcount * getMaxSpeed();
        float liter = (float) (r / getFuelConsuption());

        String text = "За время " + getcount + " ч, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч " +
                "проедет " + r + " км и израсходует " + liter + " литров топлива.";
        System.out.println(text);}

    @Override
    public void descriptionGround() {
        super.descriptionGround();
        System.out.println(", тип кузова " + getCarBody() + ", вместимость пассажиров: " + getAmountPassenger() + ".");
        System.out.println("Мощность в Kwt = " + getKwt() + ".");
    }

}

