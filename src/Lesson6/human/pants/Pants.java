package Lesson6.human.pants;

public class Pants implements IPants{
    @Override
    public void putOff() {
        System.out.println("штаны сняты");
    }

    @Override
    public void putOn() {
        System.out.println("Штаны надеты");
    }
}
