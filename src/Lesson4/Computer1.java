package Lesson4;

public class Computer1 {
    public static void main(String[] args) throws Exception {
        Computer comp = new Computer("AMD", 4,250);
        comp.characteristics();
        comp.on();
        comp.off();
        comp.characteristics();
        comp.on();
        comp.off();




    }
}
