package Lesson5;

public abstract class Transport {
    private String brand;
    private int power;
    private int maxSpeed;
    private int weight;

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getKwt(){
        double r = getPower() * 0.74;
        return r;
    }
}
