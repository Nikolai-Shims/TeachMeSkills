package Lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Ground extends Transport{
    private int amountWheels;
    private float fuelConsuption;

    public void setAmountWheels(int amountWheels){ this.amountWheels = amountWheels; }
    public int getAmountWheels() { return amountWheels; }

    public void setFuelConsuption(float fuelConsuption){ this.fuelConsuption = fuelConsuption; }
    public float getFuelConsuption(){ return fuelConsuption; }

    public String descriptionGround() {
        String text = "Марка: " + getBrand() + ", мощность " + getPower() + "лс" + ", максимальная скорость " + getMaxSpeed() + " км/ч," + " вес " + getWeight() + "кг, колличество колес: " + getAmountWheels() + ", расход топлива  на 100км = " + getFuelConsuption();
    return text;
    }
}
