package Lesson6.heads;

public class ToshibaHead implements IHead{
    private int price;
    ToshibaHead(int price){this.price = price; }
    ToshibaHead(){}

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }
    @Override
    public int getPrice() {
        return price;
    }
}
