package Lesson6.human.boots;

public class Boots implements IBoots {
    @Override
    public void putOff() {
        System.out.println("Обувь снята");
    }

    @Override
    public void putOn() {
        System.out.println("Обувь надета");
    }
}
