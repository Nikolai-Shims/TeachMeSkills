package Lesson5;

import javafx.scene.SnapshotParametersBuilder;

public abstract class Air extends  Transport{
    protected float sizeWings;
    protected int runawayLength;

    public float getSizeWings() { return sizeWings; }
    public void setSizeWings(float sizeWings){ this.sizeWings = sizeWings; }

    public int getRunawayLength() { return runawayLength; }
    public void setRunawayLength(int runawayLength){ this.runawayLength = runawayLength; }

    public void descriptionAir(){
        System.out.print("Марка: " + getBrand() + ", мощность " + getPower() + "лс" + ", максимальная скорость " + getMaxSpeed() + " км/ч," + " вес " + getWeight() + "кг, размах крыльев: " + getSizeWings() + "м, минимальная длинна взлетнопосадочной полосы = " + getRunawayLength());
    }
}
