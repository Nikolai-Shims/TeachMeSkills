package Lesson6.heads;

public class SamsungHead implements IHead{
    private int price;
    SamsungHead(int price) {
        this.price = price;
    }
    SamsungHead(){}

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
