package Lesson5;

import javafx.scene.SnapshotParametersBuilder;

public abstract class Air extends  Transport{
    private float sizeWings;
    private int runawayLength;

    public float getSizeWings() { return sizeWings; }
    public void setSizeWings(float sizeWings){ this.sizeWings = sizeWings; }

    public int getRunawayLength() { return runawayLength; }
    public void setRunawayLength(int runawayLength){ this.runawayLength = runawayLength; }

    public String descriptionAir(){
        String text = "Марка: " + getBrand() + ", мощность " + getPower() + "лс" + ", максимальная скорость " + getMaxSpeed() + " км/ч," + " вес " + getWeight() + "кг, размах крыльев: " + getSizeWings() + "м, минимальная длинна взлетнопосадочной полосы = " + getRunawayLength();
    return text;
    }
}
