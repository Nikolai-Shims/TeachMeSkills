package Lesson6.human.jacket;

public class Jacket implements IJacket {
    @Override
    public void putOff() {
        System.out.println("Куртка снята");
    }

    @Override
    public void putOn() {
        System.out.println("Куртка одета");
    }
}
