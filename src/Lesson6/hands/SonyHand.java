package Lesson6.hands;

public class SonyHand implements IHand{
    private int price;
    SonyHand(int price){
        this.price = price; }
        SonyHand(){}

    @Override
    public void upHand() {
        System.out.println("рука Sony, поднята вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
