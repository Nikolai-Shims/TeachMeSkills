package Lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Ground extends Transport{
    protected int amountWheels;
    protected float fuelConsuption;

    Ground(String brand,int power, int maxSpeed, int weight, int amountWheels, float fuelConsuption){
        super.brand = brand;
        super.power =power;
        super.maxSpeed = maxSpeed;
        super.weight = weight;
        this.amountWheels = amountWheels;
        this.fuelConsuption = fuelConsuption;
    }
Ground(){}


    public void setAmountWheels(int amountWheels){ this.amountWheels = amountWheels; }
    public int getAmountWheels() { return amountWheels; }

    public void setFuelConsuption(float fuelConsuption){ this.fuelConsuption = fuelConsuption; }
    public float getFuelConsuption(){ return fuelConsuption; }

    public void descriptionGround() {
        System.out.print("Марка: " + getBrand() + ", мощность " + getPower() + "лс" + ", максимальная скорость " + getMaxSpeed() + " км/ч," + " вес " + getWeight() + "кг, колличество колес: " + getAmountWheels() + ", расход топлива  на 100км = " + getFuelConsuption());
    }
}

