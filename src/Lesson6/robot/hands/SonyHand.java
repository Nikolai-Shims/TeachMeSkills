package Lesson6.robot.hands;

public class SonyHand implements IHand{
    private int price;
    public SonyHand(int price){ this.price = price; }
    public SonyHand(){}

    @Override
    public void upHand() {
        System.out.println("рука Sony, поднята вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
